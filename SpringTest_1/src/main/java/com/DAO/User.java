package com.DAO;

public class User {
	String id;
	String password;
	String name;
	
	public String getId(){return id;}
	public String getPwd(){return password;}
	public String getName(){return name;}
	
	public void setId(String id){this.id = id;}
	public void setPwd(String pwd){password = pwd;}
	public void setName(String name){this.name = name;}

}
