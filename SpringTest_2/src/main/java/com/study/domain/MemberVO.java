package com.study.domain;

public class MemberVO {
	private String userID;
	private String userPW;
	private String userName;
	
	
	public void setUserID (String id){
		userID = id;
	}
	public void setUserPW (String pw){
		userPW = pw;
	}
	public void setUserName (String name){
		userName = name;
	}
	
	public String getUserID (){
		return userID;
	}
	public String getUserPW (){
		return userPW;
	}
	public String getUserName (){
		return userName;
	}
}
