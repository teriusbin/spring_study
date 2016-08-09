package com.netmarble.springStudy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.netmarble.springStudy.dao.UserContentsDao;
import com.netmarble.springStudy.domain.UserContents;

@Service
public class UserContentsServiceIml implements UserContetsService{
	
	@Autowired
	private UserContentsDao userContentsDao;

	@Override
	public UserContents getUser(int seq) {
		// TODO Auto-generated method stub
		return userContentsDao.getUser(seq);
	}

	@Override
	public int insertUser(String id, String pw, String name) {
		// TODO Auto-generated method stub
		UserContents user = new UserContents();
        user.setUSER_ID(id);
        user.setUSER_PASS(pw);
        user.setUSER_NAME(name);
		return userContentsDao.insertUser(user);
	}

	@Override
	public UserContents getUserById(String id) {
		// TODO Auto-generated method stub
		return userContentsDao.getUserById(id);
	}

	@Override
	public List<UserContents> getUserAll() {
		// TODO Auto-generated method stub
		return userContentsDao.getUserAll();
	}
	
	@Override
	public int deleteUser(String id, String pw, String name) {
		// TODO Auto-generated method stub
		UserContents user = new UserContents();
	    user.setUSER_ID(id);
	    user.setUSER_PASS(pw);
	    user.setUSER_NAME(name);
		return userContentsDao.deleteUser(user);
	}

}
