package com.netmarble.springstudy.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * Created by mydus on 2016-07-24.
 */
@Configuration
@PropertySource("classpath:jdbc.properties")
public class DataSourceConfig {
	
	@Value("${datasource.url}") String url;
    @Value("${datasource.username}") String username;
    @Value("${datasource.password}") String password;
    @Value("${datasource.driverClassName}") String driverClassName;
    
    @Bean
    public DataSource dataSource(){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setDriverClassName(driverClassName);
        return dataSource;
    }
}
