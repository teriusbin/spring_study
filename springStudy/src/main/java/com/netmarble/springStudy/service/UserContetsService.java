package com.netmarble.springStudy.service;

import java.util.List;

import com.netmarble.springStudy.domain.UserContents;

public interface UserContetsService {

	UserContents getUser(int seq);
    UserContents getUserById(String id);
	int insertUser(String id, String pw, String name);
	int deleteUser(String id, String pw, String name);
	public List<UserContents> getUserAll();
}
