package www.og.com.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
	public void add(User user) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://52.78.65.114:3306/STUDY", "netmarble2016","studySpring");
		
		PreparedStatement ps = c.prepareStatement("insert into USER values(null,?,?,?)");
		ps.setString(1, user.getId());
		ps.setString(2, user.getPwd());
		ps.setString(3, user.getName());
		
		ps.executeUpdate();
		ps.close();
		c.close();
	}

	public User getbyId(String uid) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://52.78.65.114:3306/STUDY", "netmarble2016","studySpring");
		
		PreparedStatement ps = c.prepareStatement("select * from USER where USER_ID=?");
		ps.setString(1, uid);
		
		ResultSet rs = ps.executeQuery();
		rs.next();
		
		User usr = new User();
		usr.setId(rs.getString("USER_ID"));
		usr.setPwd(rs.getString("USER_NAME"));
		usr.setName(rs.getString("USER_PASS"));
		
		rs.close();
		ps.close();
		c.close();
		
		return usr;
	}
}
