package com.netmarble.springStudy.dao;

import com.netmarble.springStudy.domain.UserContents;

public interface UserContentsDao {
	
    public int insertUser(UserContents user);
    public UserContents getUser(int seq);
    public UserContents getUserById(String id);
    public int deleteUser(UserContents user);
	
}
