package com.netmarble.springStudy;


import com.netmarble.springStudy.aop.CacheConsts;
import com.netmarble.springStudy.aop.CacheRemove;
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
import java.util.Iterator;
import java.util.List;

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
	        
	  /*  @Before
	    public void set() throws SQLException{
	    	connectionTest();
	    	//insertTest();
	    }
	    */
	/*    @After
	    public void unset(){
	    	assertTrue(userMapper.deleteUser(user)>0);
	    }*/
	    /*@Test
	    public void connectionTest() throws SQLException {
	        PreparedStatement state = dataSource.getConnection().prepareStatement("SELECT 1");
	        ResultSet set = state.executeQuery();
	        assertTrue(set.getMetaData().getColumnCount()==1);
	    }*/

/*	    public void insertTest(){
	    	user = createUser();
	    	assertTrue(userMapper.insertUser(user)>0);
	    }*/
	    
	    @Test
		@CacheRemove(cacheName=CacheConsts.DBName)
	    public void test(){
	    /*	UserContents user = new UserContents();
	        user.setUSER_ID("teriusbin");
	        user.setUSER_PASS("1234");
	        user.setUSER_NAME("woongkyu");
	        
	        userMapper.insertUser(user);
	        */
	        List<UserContents> test = userMapper.getUserAll();
		    System.out.println("~");
		    Iterator<UserContents> iterator = test.iterator();
			while (iterator.hasNext()) {
				UserContents element = (UserContents) iterator.next();
				System.out.println(element.getUSER_NAME());
			}
			
			userMapper.deleteUser(user);
			
			   List<UserContents> test2 = userMapper.getUserAll();
			    System.out.println("~");
			    Iterator<UserContents> iterator2 = test2.iterator();
				while (iterator2.hasNext()) {
					UserContents element = (UserContents) iterator2.next();
					System.out.println(element.getUSER_NAME());
				}
	    	//assertTrue(user.equals(test));
	    }
	    /*
	    @Test
	    public void testID(){
		    UserContents test = userMapper.getUserById(user.getUSER_ID());
	    	assertTrue(user.equals(test));
	    }
	    */
	    /*
	    private UserContents createUser(){
	    	UserContents user = new UserContents("teriusbin", "1234", "woongkyu");
	        return user;
	    }
	    */
    
    
}