package ch20.oracle.sec09.exam02;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BoardSelectExample {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.23:1521/xe", "testuser1", "test1234");
			
			//String sql = "SELECT userid, username, userpassword, userage, useremail FROM users WHERE userid=?";
			
			//PreparedStatement pstmt = conn.prepareStatement(sql);
			//pstmt.setString(1, "winter");
			
			String sql = "SELECT bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata FROM boards WHERE bwriter=?";
			Statement stmt = conn.createStatement();
			
			//ResultSet rs= pstmt.executeQuery();
			ResultSet rs= stmt.executeQuery(sql);
			if(rs.next()) {
				Board b = new Board();
				b.setBno(rs.getInt("bno"));
				b.setBtitle(rs.getString("btitle"));
				b.setBcontent(rs.getString("bcontent"));
				b.setBwriter(rs.getString("bwriter"));
				b.setBdate(rs.getDate("bdate"));
				b.setBfilename(rs.getString("bfilename"));
				b.setBfiledata(rs.getBlob("bfiledata"));
				System.out.println(b);
				
				Blob blob = b.getBfiledata();
				if(blob != null) {
					InputStream is = blob.getBinaryStream();
					OutputStream os = new FileOutputStream("/Users/yhee/Desktop/MAC/temp/" + b.getBfilename());
					is.transferTo(os);
					os.flush();
					os.close();
					is.close();
				}
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
