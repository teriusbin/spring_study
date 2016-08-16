package com.netmarble.springStudy.dao;

import com.netmarble.springStudy.domain.UserContents;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.netmarble.springStudy.aop.CacheRemove;
import com.netmarble.springStudy.aop.CacheConsts;
import com.netmarble.springStudy.dao.mapper.UserMapper;

@Repository
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
	public List<UserContents> getUserAll() {
		try{
			return userMapper.getUserAll();
		}catch(Exception e){
			 System.out.println(e.getMessage());
		}
		return null;
	}
	
	@Override
	@CacheRemove(cacheName=CacheConsts.DBName)
	public int deleteUser(UserContents user) {
		try{
			return userMapper.deleteUser(user);
		}catch(Exception e){
			 System.out.println(e.getMessage());
		}
		return 0;
	}

	
}
