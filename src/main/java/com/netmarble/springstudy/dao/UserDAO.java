package com.netmarble.springstudy.dao;

import com.netmarble.springstudy.constant.ResultStatus;
import com.netmarble.springstudy.exception.BoardException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.netmarble.springstudy.domain.User;
import com.netmarble.springstudy.mapper.UserMapper;

@Repository
public class UserDAO {
	
	@Autowired UserMapper mapper;

	public boolean addUser(User user){
		return mapper.insertUser(user)>0;
	}

	public User getUser(String id){
		return mapper.getUserById(id);
	}
}
