package www.og.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import junit.framework.TestCase;

public class MySQLConnectTest extends TestCase {

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/ogdb";
	private static final String USER = "root";
	private static final String PWD = "12132323";
	private ArrayList<String> dbUID = new ArrayList<String>();
	
	public void testConnection() throws Exception {
		ResultSet result = null;
		Class.forName(DRIVER);
		
		/*
		try (Connection con = DriverManager.getConnection(URL, USER, PWD)) {
			System.out.println("OG " + con);

			
			Statement stmt = null;
			String query = "select * from ouser where UID like 'test%'";

			try {
				stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				result = rs;
				System.out.println("result: " + rs + "\n");
				while (rs.next()) {
					String UID = rs.getString("UID");
					dbUID.add(UID);
					int USCORE = rs.getInt("USCORE");
					System.out.println(UID + "\t\t" + USCORE );
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		DBConnection dbcon = new DBConnection();
		System.out.println("size:"+dbcon.getDBCon());
//		return result;
	}
}