package com.netmarble.springstudy;

import com.netmarble.springstudy.config.BaseConfig;
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

/**
 * Created by mydus on 2016-07-24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BaseConfig.class, loader = AnnotationConfigContextLoader.class)
public class DatasourceTest {
    @Autowired
    DataSource dataSource;

    @Test
    public void test(){
    	try{
    		PreparedStatement state = dataSource.getConnection().prepareStatement("SELECT 1");
            ResultSet set = state.executeQuery();
            System.out.println(set.getMetaData().getColumnCount());
    	}catch(SQLException e){
    		e.printStackTrace();
    	}
        
    }
}
