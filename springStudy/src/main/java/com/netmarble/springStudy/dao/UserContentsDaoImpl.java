package com.netmarble.springStudy.dao;

import com.netmarble.springStudy.domain.UserContents;

import org.springframework.beans.factory.annotation.Autowired;
import com.netmarble.springStudy.dao.mapper.UserMapper;

public class UserContentsDaoImpl implements UserContentsDao{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public int insertUser(UserContents user) {
		try{
			return userMapper.insertUser(user);
		}catch(Exception e){
			 System.out.println(e.getMessage());
		}
		return 0;
	}

	@Override
	public UserContents getUser(int seq) {
		try{
			return userMapper.getUser(seq);
		}catch(Exception e){
			 System.out.println(e.getMessage());
		}
		return null;
	}

	@Override
	public UserContents getUserById(String id) {
		try{
			return userMapper.getUserById(id);
		}catch(Exception e){
			 System.out.println(e.getMessage());
		}
		return null;
	}

	@Override
	public int deleteUser(UserContents user) {
		try{
			return userMapper.deleteUser(user);
		}catch(Exception e){
			 System.out.println(e.getMessage());
		}
		return 0;
	}

	
}
