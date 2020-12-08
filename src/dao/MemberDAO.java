package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;


public class MemberDAO {
	private MemberDAO() {}
	private static MemberDAO instance=new MemberDAO();
	public static MemberDAO getInstance() {
		return instance;
	}
	
	private Connection conn; //DB 연결 객체
	private PreparedStatement pstmt; //Query 작성 객체
	private ResultSet rs; //Query 결과 커서
	
	//성공 1, 실패 -1, 없음 0
	public int nameAndPassword(String id, String pw) {
		// DB 연결
		conn = DBConnection.getConnection();
		
		try {
			// Query 작성
			pstmt = conn.prepareStatement("select * from member where m_id = ? and m_pw = ?");
			
			pstmt.setString(1, id);
			pstmt.setString(2,pw);
			
			// Query 실행
			rs = pstmt.executeQuery();
			
			//5. rs는 query한 결과의 첫번째 행(레코드) 직전에 대기중
			if(rs.next()) { //next()함수는 커서를 한칸 내리면서 해당 행에 데이터가 있으면 true, 없으면 false 반환
				return 1; //로그인 성공 (GongchaOrder)
			}		
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return -1; //로그인 실패
	}
	
	//성공 1, 실패 -1, 
	public int save(Member member) {
		conn = DBConnection.getConnection();
		
		try {
			pstmt = conn.prepareStatement("insert into member values(?,?,?,?)");
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPassword());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getEmail());
			pstmt.executeUpdate(); //return값은 처리된 레코드의 개수
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

}



