package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import com.java.ex.Exp.Greentea;

public class GongchaDAO {
	public GongchaDAO() {}
	private static GongchaDAO instance=new GongchaDAO(); //싱글턴 패턴 
	public static GongchaDAO getInstance() {
		return instance;
	}
	
	private Connection conn; //DB 연결 객체
	private PreparedStatement pstmt; //Query 작성 객체
	private ResultSet rs; //Query 결과 커서
	
	public int findByUsernameAndPassword(int GreenTea) {
		// DB 연결
		conn = DBConnection.getConnection();
		
		try {
			// Query 작성
			pstmt = conn.prepareStatement("select * from member where Gongcha");
			pstmt.setLong(1, GreenTea);
			
			// Query 실행
			rs = pstmt.executeQuery();
			
			if(rs.next()) { //next()함수는 커서를 한칸 내리면서 해당 행에 데이터가 있으면 true, 없으면 false 반환
				//결과가 있다는 것은 해당 아이디와 비번에 매칭되는 값이 있다는 뜻.
				return 1; //로그인 성공
			}		
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return -1; //로그인 실패
	}
	
	//성공 1, 실패 -1, 
	public int Morning(Gongcha gongcha) {
		conn = DBConnection.getConnection();
		
		try {
			pstmt = conn.prepareStatement("insert into Gongcha values(?,?,?,?,?,?,?,?)");
			pstmt.setLong(1, gongcha.getGreenTea());
			pstmt.setLong(2, gongcha.getDarkchocoMilktea());
			pstmt.setLong(3, gongcha.getStrawberrySmoody());
			pstmt.setLong(4, gongcha.getMangoSmoody());
			pstmt.setLong(5, gongcha.getBlakcTea());
			pstmt.setLong(6, gongcha.getChocoSmoody());
			pstmt.setLong(7, gongcha.getKuandkuSmoody());
			pstmt.setLong(8, gongcha.getBlackSugerMilktea());
			pstmt.executeUpdate(); //return값은 처리된 레코드의 개수
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	
	
}
