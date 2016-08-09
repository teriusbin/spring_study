package com.netmarble.springstudy;

import static org.junit.Assert.assertTrue;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.transaction.annotation.Transactional;

import com.netmarble.springstudy.config.BaseConfig;
import com.netmarble.springstudy.domain.User;
import com.netmarble.springstudy.mapper.UserMapper;

/**
 * Created by mydus on 2016-07-24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BaseConfig.class, loader = AnnotationConfigContextLoader.class)
@Transactional
public class DatasourceTest {
    @Autowired
    DataSource dataSource;

    @Autowired
    UserMapper userMapper;

    User user;
        
    @Before
    public void set() throws SQLException{
    	connectionTest();
    	insertTest();
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
    	User test = userMapper.getUser(user.getUSER_SEQ());
    	assertTrue(user.equals(test));
    }
    
    @Test
    public void testID(){
    	User test = userMapper.getUserById(user.getUSER_ID());
    	assertTrue(user.equals(test));
    }
    

    private User createUser(){
        User user = new User();
        user.setUSER_ID("dramatic33");
        user.setUSER_PASS("dramazz");
        user.setUSER_NAME("hwiyeon.kim");
        return user;
    }
}
