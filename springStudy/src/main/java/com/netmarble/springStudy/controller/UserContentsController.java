package com.netmarble.springStudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.netmarble.springStudy.domain.UserContents;
import com.netmarble.springStudy.service.UserContetsService;

@RequestMapping(value = "/test")
public class UserContentsController {
	@Autowired
	private UserContetsService userContentsService;
	
	@RequestMapping(method=RequestMethod.POST, value="/id")
	@ResponseStatus(HttpStatus.OK)
	public int addUser(@RequestParam(value="id", required=true)String userId,
					   @RequestParam(value="pw", required=true)String userPassword,
					   @RequestParam(value="name", required=true)String userName){
		
		return userContentsService.insertUser(userId, userPassword, userName);
		
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/id")
	@ResponseStatus(HttpStatus.OK)
	public int deleteUser(@RequestParam(value="id", required=true)String userId,
						  @RequestParam(value="pw", required=true)String userPassword,
			              @RequestParam(value="name", required=true)String userName){
		
		return userContentsService.deleteUser(userId, userPassword, userName);
	}
	
}
