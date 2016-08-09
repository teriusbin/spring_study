package com.netmarble.springstudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.netmarble.springstudy.dao.UserDAO;
import com.netmarble.springstudy.domain.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired UserDAO dao;
	
	@RequestMapping("/user_form")
	public String userForm(){
		return "user/user_form";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public String addUser(User user, Model model){
		boolean success = dao.addUser(user);
		if(success){
			model.addAttribute("name", user.getUSER_NAME());
			return "user/add_success";
		} else {
			return "user/add_fail";
		}
	}
}
