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
	
	private Connection conn; //DB ���� ��ü
	private PreparedStatement pstmt; //Query �ۼ� ��ü
	private ResultSet rs; //Query ��� Ŀ��
	
	//���� 1, ���� -1, ���� 0
	public int nameAndPassword(String id, String pw) {
		// DB ����
		conn = DBConnection.getConnection();
		
		try {
			// Query �ۼ�
			pstmt = conn.prepareStatement("select * from member where m_id = ? and m_pw = ?");
			
			pstmt.setString(1, id);
			pstmt.setString(2,pw);
			
			// Query ����
			rs = pstmt.executeQuery();
			
			//5. rs�� query�� ����� ù��° ��(���ڵ�) ������ �����
			if(rs.next()) { //next()�Լ��� Ŀ���� ��ĭ �����鼭 �ش� �࿡ �����Ͱ� ������ true, ������ false ��ȯ
				return 1; //�α��� ���� (GongchaOrder)
			}		
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return -1; //�α��� ����
	}
	
	//���� 1, ���� -1, 
	public int save(Member member) {
		conn = DBConnection.getConnection();
		
		try {
			pstmt = conn.prepareStatement("insert into member values(?,?,?,?)");
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPassword());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getEmail());
			pstmt.executeUpdate(); //return���� ó���� ���ڵ��� ����
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

}



