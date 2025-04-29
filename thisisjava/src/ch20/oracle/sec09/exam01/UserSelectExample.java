package ch20.oracle.sec09.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserSelectExample {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.23:1521/xe", "testuser1", "test1234");
			
			//String sql = "SELECT userid, username, userpassword, userage, useremail FROM users WHERE userid=?";
			
			//PreparedStatement pstmt = conn.prepareStatement(sql);
			//pstmt.setString(1, "winter");
			
			String sql = "SELECT userid, username, userpassword, userage, useremail FROM users WHERE userid='winter'";
			Statement stmt = conn.createStatement();
			
			//ResultSet rs= pstmt.executeQuery();
			ResultSet rs= stmt.executeQuery(sql);
			if(rs.next()) {
				User user = new User();
				user.setUserId(rs.getString("userid"));
				user.setUserName(rs.getString("username"));
				//user.setUserPassword(rs.getString("userpassword"));
				user.setUserAge(rs.getInt(4));
				user.setUserEmail(rs.getString(5));
				System.out.println(user);
			} else {
				System.out.println("사용자 아이디가 존재하지 않음");
			}
			rs.close();
			stmt.close();
			//pstmt.close();
			//System.out.println("연결 성공");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			//try {rs.close();} catch(Exception e) {}
			//try {stmt.close();} catch(Exception e) {}
			if(conn != null) {
				try {
					conn.close();
					System.out.println("연결 끊기");
				} catch(SQLException e) {}
			}
		}
	}

}
