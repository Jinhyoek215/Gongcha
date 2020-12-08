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
	private static GongchaDAO instance=new GongchaDAO(); //�̱��� ���� 
	public static GongchaDAO getInstance() {
		return instance;
	}
	
	private Connection conn; //DB ���� ��ü
	private PreparedStatement pstmt; //Query �ۼ� ��ü
	private ResultSet rs; //Query ��� Ŀ��
	
	public int findByUsernameAndPassword(int GreenTea) {
		// DB ����
		conn = DBConnection.getConnection();
		
		try {
			// Query �ۼ�
			pstmt = conn.prepareStatement("select * from member where Gongcha");
			pstmt.setLong(1, GreenTea);
			
			// Query ����
			rs = pstmt.executeQuery();
			
			if(rs.next()) { //next()�Լ��� Ŀ���� ��ĭ �����鼭 �ش� �࿡ �����Ͱ� ������ true, ������ false ��ȯ
				//����� �ִٴ� ���� �ش� ���̵�� ����� ��Ī�Ǵ� ���� �ִٴ� ��.
				return 1; //�α��� ����
			}		
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return -1; //�α��� ����
	}
	
	//���� 1, ���� -1, 
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
			pstmt.executeUpdate(); //return���� ó���� ���ڵ��� ����
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	
	
}
