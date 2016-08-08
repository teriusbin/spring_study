package com.study.yena;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import junit.framework.TestCase;

public class DataSourceTest extends TestCase {

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://52.78.65.114:3306/STUDY";
	private static final String USER = "";
	private static final String PWD = "";
	private ArrayList<String> dbUID = new ArrayList<String>();
	
	public void testConnection() throws Exception {
		ResultSet result = null;
		Class.forName(DRIVER);
	
		
		try (Connection con = DriverManager.getConnection(URL, USER, PWD)) {
			System.out.println(con);

			
			Statement stmt = null;
			String query = "select * from USER where USER_ID like 'test%'";

			try {
				stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				result = rs;
				System.out.println("result: " + rs + "\n");
				while (rs.next()) {
					String UID = rs.getString("USER_ID");
					dbUID.add(UID);
					int USCORE = rs.getInt("USER_SEQ");
					System.out.println("ID: "+UID + "\t\t" + "SEQ: " + USCORE );
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		DBConnection dbcon = new DBConnection();
//		return result;
	}
}
