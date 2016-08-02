package com.netmarble.springStudy;

import com.netmarble.springStudy.config.BaseConfig;
import com.netmarble.springStudy.domain.UserContents;
import com.netmarble.springStudy.dao.mapper.UserMapper;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import static org.junit.Assert.assertTrue;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BaseConfig.class, loader = AnnotationConfigContextLoader.class)
public class DatasourceTest {
    
    @Autowired
    DataSource dataSource;

    @Autowired
    UserMapper userMapper;

    UserContents user;
        
    @Before
    public void set() throws SQLException{
    	connectionTest();
    	insertTest();
    }
    
    @After
    public void unset(){
    	assertTrue(userMapper.deleteUser(user)>0);
    }
    
    private void connectionTest() throws SQLException {
        PreparedStatement state = dataSource.getConnection().prepareStatement("SELECT 1");
        ResultSet set = state.executeQuery();
        assertTrue(set.getMetaData().getColumnCount()==1);
    }

    private void insertTest(){
    	user = createUser();
    	assertTrue(userMapper.insertUser(user)>0);
    }
    
    @Test
    public void test(){
    	UserContents test = userMapper.getUser(user.getUSER_SEQ());
    	assertTrue(user.equals(test));
    }
    
    @Test
    public void testID(){
    	UserContents test = userMapper.getUserById(user.getUSER_ID());
    	assertTrue(user.equals(test));
    }
    

    private UserContents createUser(){
    	UserContents user = new UserContents("russa", "test", "woongkyu");
        return user;
    }
    
    
}