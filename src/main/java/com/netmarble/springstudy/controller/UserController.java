package com.netmarble.springstudy.controller;

import com.netmarble.springstudy.domain.Response;
import com.netmarble.springstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.netmarble.springstudy.dao.UserDAO;
import com.netmarble.springstudy.domain.User;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {
	
	@Autowired
	UserService service;
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	@ResponseBody
	public Response addUser(@RequestBody User user){
		service.addUser(user);
		return new Response();
	}

	@RequestMapping(value="/login", method=RequestMethod.POST)
	@ResponseBody
	public Response login(@RequestBody User user){
		service.login(user);
		return new Response();
	}
}
