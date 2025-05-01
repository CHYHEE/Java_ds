package ch20.maria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class StudentExample {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/study", "testuser", "test1234");
			Statement stmt = conn.createStatement();
			String sql = "select\n"
					+ "	s.`name`, m.`name`, p.name\n"
					+ "from student s join major m on s.major1 = m.code\n"
					+ "left join professor p on s.profno = p.no";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getString("sname" + "  " + rs.getString("mname") + "  " + rs.getString("pname")));
			}
			
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
