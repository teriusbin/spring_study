package www.og.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DBConnection {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/ogdb";
	private static final String USER = "root";
	private static final String PWD = "12132323";
	private Connection con;
	
	public ArrayList<String> dbUID = new ArrayList<String>();

	public Connection getDBCon(){return con;}
	
	private void testConnection() throws Exception {
		ResultSet result = null;
		Class.forName(DRIVER);

		try (Connection con = DriverManager.getConnection(URL, USER, PWD)) {
			System.out.println("OG " + con);

			
			Statement stmt = null;
			String query = "select * from ouser where UID like 'test%'";

			try {
				stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				result = rs;

				while (rs.next()) {
					String UID = rs.getString("UID");
					dbUID.add(UID);
					int USCORE = rs.getInt("USCORE");
					System.out.println(UID + "\t\t" + USCORE );
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("size:"+dbUID.size());

	}

}
