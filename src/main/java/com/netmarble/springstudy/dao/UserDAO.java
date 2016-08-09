package com.netmarble.springstudy.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.netmarble.springstudy.domain.User;
import com.netmarble.springstudy.mapper.UserMapper;

@Repository
public class UserDAO {
	
	@Autowired UserMapper mapper;
	
	@Transactional
	public boolean addUser(User user){
		if(mapper.getUserById(user.getUSER_ID())==null){
			return mapper.insertUser(user)>0;
		} else {
			return false;
		}
	}
}
