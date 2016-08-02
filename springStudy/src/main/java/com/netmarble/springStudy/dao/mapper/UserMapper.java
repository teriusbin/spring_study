package com.netmarble.springStudy.dao.mapper;

import com.netmarble.springStudy.domain.UserContents;

public interface UserMapper {
	 public int insertUser(UserContents user);
	 public UserContents getUser(int seq);
	 public UserContents getUserById(String id);
	 public int deleteUser(UserContents user);
}
