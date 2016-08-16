package com.netmarble.springstudy.mvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.netmarble.springstudy.config.BaseConfig;
import com.netmarble.springstudy.constant.ResultStatus;
import com.netmarble.springstudy.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by mydus on 2016-08-16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = BaseConfig.class)
@Transactional
public class UserMVCTest {

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;
    private ObjectMapper mapper;
    @Before
    public void setup() throws Exception {
        mapper = new ObjectMapper();
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
        this.addUser()
            .andExpect(jsonPath("$.code").value(0));
    }

    public ResultActions addUser() throws Exception {
        String content = mapper.writeValueAsString(createUser());
        return this.mockMvc.perform(
                post("/user/add")
                        .accept(MediaType.APPLICATION_JSON)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(content))
        .andExpect(status().isOk());
    }

    public ResultActions login(User user) throws Exception {
        String content = mapper.writeValueAsString(user);
        return this.mockMvc.perform(
                post("/user/login")
                        .accept(MediaType.APPLICATION_JSON)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(content))
                .andExpect(status().isOk());
    }

    @Test
    public void duplicateUserTest() throws Exception {
        this.addUser()
                .andExpect(jsonPath("$.code").value(ResultStatus.EXIST_USER.getCode()));
    }

    @Test
    public void login() throws Exception {
        User user = new User();
        user.setId("dramatic33");
        user.setPass("study");
        login(user).andExpect(jsonPath("$.code").value(0));
        user.setId("dramatic32");
        login(user).andExpect(jsonPath("$.code").value(ResultStatus.NOT_EXIST_USER.getCode()));
        user.setId("dramatic33");
        user.setPass("sttttudy");
        login(user).andExpect(jsonPath("$.code").value(ResultStatus.WRONG_PASSWORD.getCode()));
    }

    private User createUser(){
        User user = new User();
        user.setName("dramatic33");
        user.setPass("study");
        user.setId("dramatic33");
        return user;
    }
}
