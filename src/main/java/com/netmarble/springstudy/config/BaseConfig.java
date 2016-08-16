package com.netmarble.springstudy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
/**
 * Created by mydus on 2016-07-24.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.netmarble.springstudy")
public class BaseConfig extends WebMvcConfigurerAdapter{
    @Bean
    PropertySourcesPlaceholderConfigurer placeholderConfigurer(){
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        return configurer;
    }
   
    @Bean
    MappingJackson2HttpMessageConverter converter(){
    	MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
    	converter.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON));
    	return converter;
    }
}
