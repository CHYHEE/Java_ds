package ch20.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BoardExample {
	private Scanner scanner = new Scanner(System.in);
    private Connection conn;

    public BoardExample() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.23:1521/xe", "testuser1", "test1234");
        } catch (Exception e) {
            e.printStackTrace();
            exit();
        }
    }

    public void list() {
        System.out.println();
        System.out.println("[게시물 목록]");
        System.out.println("----------------------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
        System.out.println("----------------------------------------------");
        

        try {
            String sql = "SELECT * FROM boards ORDER BY bno DESC";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()){
                Board b = new Board();
                b.setBno(rs.getInt("bno"));
                b.setBtitle(rs.getString("btitle"));
                b.setBcontent(rs.getString("bcontent"));
                b.setBwriter(rs.getString("bwriter"));
                b.setBdate(rs.getDate("bdate"));
            }
        }catch (Exception e) {
            e.printStackTrace();
            exit();
        }
    }

    public void mainMeun() {
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println("메인 매뉴 : 1.Create | 2.Read | 3.Clear | 4.Exit");
        System.out.println("----------------------------------------------");
        System.out.println("매뉴 선택 : ");
        String menuNo = scanner.nextLine();

        switch (menuNo) {
            case "1" -> create();
            case "2" -> read();
            case "3" -> clear();
            case "4" -> exit();
        }
    }


	public void create() {
        Board b = new Board();
        System.out.println("[새 게시물 입력]");
        System.out.println("제목 : ");
        b.setBtitle(scanner.nextLine());
        System.out.println("내용 : ");
        b.setBcontent(scanner.nextLine());
        System.out.println("작성자 : ");
        b.setBwriter(scanner.nextLine());

        System.out.println("----------------------------------------------");
        System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
        System.out.print("메뉴 선택: ");
        String menuNo = scanner.nextLine();
        if(menuNo.equals("1")) {
            try {
                String sql = "INSERT INTO boards (bno, btitel, bcontent, bwriter, bdate) VALUES (SQL_BNO.NEXTVAL, ?, ?, ?, SYSDATE)";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, b.getBtitle());
                pstmt.setString(2, b.getBcontent());
                pstmt.setString(3, b.getBwriter());
                pstmt.executeUpdate();
                pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
                exit();
            }
        }
        list();
    }

    public void read() {
        System.out.println("[게시물 읽기]");
        System.out.print("bno");
        int bno = Integer.parseInt(scanner.nextLine());

        try {
            String sql = "SELECT bno, btitle, bcontent, bwriter, bdate FROM boards WHERE bno =?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, bno);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                Board b = new Board();
                b.setBno(rs.getInt("bno"));
                b.setBtitle(rs.getString("btitle"));
                b.setBcontent(rs.getString("bcontent"));
                b.setBwriter(rs.getString("bwriter"));
                b.setBdate(rs.getDate("bdate"));
                System.out.println("##############");
                System.out.println("번호: " + b.getBno());
                System.out.println("제목: " + b.getBtitle());
                System.out.println("내용: " + b.getBcontent());
                System.out.println("작성자: " + b.getBwriter());
                System.out.println("날짜: " + b.getBdate());
                System.out.println("##############");

            }
            rs.close();
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            exit();
        }
        
        list();
    }
    
    public void update(Board b) {
        System.out.println("[수정 내용 입력]");
        System.out.print("제목: ");
        b.setBtitle(scanner.nextLine());
        System.out.print("내용: ");
        b.setBcontent(scanner.nextLine());
        System.out.print("작성자: ");
        b.setBwriter(scanner.nextLine());

        System.out.println("----------------------------------------------");
        System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
        System.out.print("메뉴 선택: ");
        String menuNo = scanner.nextLine();

        if (menuNo.equals("1")) {
            try {
                String sql = "UPDATE boards SET btitle=?, bcontent=?, bwriter=? WHERE bno=?";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, b.getBtitle());
                pstmt.setString(2, b.getBcontent());
                pstmt.setString(3, b.getBwriter());
                pstmt.setInt(4, b.getBno());
                pstmt.executeUpdate();
                pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
                exit();
            }
        }
        list();
    }

    public void delete(Board b) {
        try {
            String sql = "DELETE FROM boards WHERE bno=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, b.getBno());
            pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            exit();
        }
        list();
    }
    
    public void clear() {
        System.out.println("[게시물 전체 삭제]");
        System.out.println("----------------------------------------------");
        System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
        System.out.print("메뉴 선택: ");
        String menuNo = scanner.nextLine();
        if (menuNo.equals("1")) {
            try {
                String sql = "TRUNCATE TABLE boards";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.executeUpdate();
                pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
                exit();
            }
        }
        list();
    }

    public void exit() {
    	if(conn != null) {
    		try {
    			conn.close();
    		} catch(SQLException e) {}
    	}
    	System.out.println("게시판 종료");
        System.exit(0);
    }

    public static void main(String[] args) {
        BoardExample be = new BoardExample();
        be.list();
    }
}
