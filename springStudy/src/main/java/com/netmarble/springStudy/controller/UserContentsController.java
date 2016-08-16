package com.netmarble.springStudy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.netmarble.springStudy.domain.UserContents;
import com.netmarble.springStudy.dto.BseDto;
import com.netmarble.springStudy.dto.ListBaseDto;
import com.netmarble.springStudy.service.UserContetsService;
@Controller
@RequestMapping(value = "/test")
public class UserContentsController {

	@Autowired
	private UserContetsService userContentsService;
	
	@RequestMapping(method=RequestMethod.POST, value="/id")
	@ResponseStatus(HttpStatus.OK)
	public BseDto<Integer> addUser(@RequestBody UserContents person) throws Exception{
		
		int insertedResult = 0;
		try{
			insertedResult = userContentsService.insertUser(person.getUSER_ID(), person.getUSER_PASS(), person.getUSER_NAME());
		}catch(Exception e){
			
		}
		return new BseDto<Integer>(insertedResult);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE, value="/id")
	@ResponseStatus(HttpStatus.OK)
	public BseDto<Integer> deleteUser(@RequestParam(value="id", required=true)String userId,
									  @RequestParam(value="pw", required=true)String userPassword,
									  @RequestParam(value="name", required=true)String userName){
		
		int insertedResult = 0;
		try{
			insertedResult = userContentsService.deleteUser(userId, userPassword, userName);
		}catch(Exception e){
			
		}
		return new BseDto<Integer>(insertedResult);
	
	}
	
	
	@RequestMapping(method=RequestMethod.GET, value="/id")
	@ResponseStatus(HttpStatus.OK)
	public BseDto<UserContents> getUser(@RequestParam(value="id", required=true)String userId) throws Exception{
		
		UserContents user = null;
		try{
			user  = userContentsService.getUserById(userId);
		}catch(Exception e){
			
		}
		return new BseDto<UserContents>(user);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/id/all")
	@ResponseStatus(HttpStatus.OK)
	public ListBaseDto getUserAll() throws Exception{
		
		List<UserContents> resultList = null;
		try{
			resultList = userContentsService.getUserAll();
		}catch(Exception e){
			
		}
		return new ListBaseDto(resultList, resultList.size());
	}
	
	
}
