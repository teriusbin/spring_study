package com.netmarble.springstudy.service;

import com.netmarble.springstudy.constant.ResultStatus;
import com.netmarble.springstudy.dao.UserDAO;
import com.netmarble.springstudy.domain.User;
import com.netmarble.springstudy.exception.BoardException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mydus on 2016-08-17.
 */
@Service
public class UserService {
    @Autowired
    UserDAO dao;

    public boolean login(User user){
        User target = dao.getUser(user.getId());
        if(target==null) throw new BoardException(ResultStatus.NOT_EXIST_USER);
        if(!target.getPass().equals(user.getPass())) throw new BoardException(ResultStatus.WRONG_PASSWORD);
        return true;
    }

    @Transactional
    public boolean addUser(User user){
        if(dao.getUser(user.getId())!=null) throw new BoardException(ResultStatus.EXIST_USER);
        dao.addUser(user);
        return true;
    }
}
