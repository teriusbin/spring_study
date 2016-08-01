package com.netmarble.springstudy.mapper;

import com.netmarble.springstudy.domain.User;

/**
 * Created by mydus on 2016-08-01.
 */
public interface UserMapper {
    public int insertUser(User user);
    public User getUser(int seq);
    public User getUserById(String id);
    public int deleteUser(User user);
}
