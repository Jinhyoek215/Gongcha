package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {
	public static Connection getConnection() {
		Connection conn=null;
		 String driver = "org.mariadb.jdbc.Driver";
		 String url ="jdbc:mariadb://localhost:3306/test"; //집은 3306 학교 3307
		 String uid = "root";
		 String pwd = "1234";
		
		
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url, uid, pwd);
			System.out.println("DB연결 완료");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("DB연결 실패");
		}
		return conn;
	}

	public static void main(String[] args) {
		getConnection();
	}
}

