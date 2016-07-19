package com.netmarble.springStudy;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;


public class MySQLConnection {

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://52.78.65.114:3306/?user=netmarble2016";
	private static final String USER = "";
	private static final String PW = "";
	
	
	@Test
	public void testConnection() throws Exception{
		
		Class.forName(DRIVER);
		
		try{
			Connection con  = DriverManager.getConnection(URL,USER,PW);
			System.out.println(con);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
