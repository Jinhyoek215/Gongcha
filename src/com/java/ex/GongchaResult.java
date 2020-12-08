package com.java.ex;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

import dao.Gongcha;
import dao.GongchaDAO;
import com.java.ex.GongchaOrder;

public class GongchaResult extends JFrame implements ActionListener {
	static JButton btnA = new JButton("���");
	static JTextArea txtResult = new JTextArea();
	
	Connection con;
	Statement stmt;
	ResultSet rs;
	
	String driver = "org.mariadb.jdbc.Driver";
	 String url ="jdbc:mariadb://localhost:3306/test"; //���� 3306 �б� 3307
	 String uid = "root";
	 String pwd = "1234";
	public GongchaResult() {
			setTitle("���");
			
			layInit();
			accDb();
			
			setBounds(200,200,750,600);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void layInit() {
		JPanel panel = new JPanel();
		panel.add(btnA);
		txtResult.setEditable(false);
		JScrollPane pane = new JScrollPane(txtResult);
		add("Center",pane);
		add("North",panel);
		btnA.addActionListener(this);
		
		
	}
	private void accDb() {
		try {
			Class.forName(driver);
		} catch (Exception e) {
			System.out.println("����:"+e);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			con = DriverManager.getConnection(url,uid,pwd);
			stmt = con.createStatement();
			String sql="select * from Gongcha";
			rs= stmt.executeQuery(sql);
			
			txtResult.setText("�׸�Ƽ:\t��ũ���ڹ�ũƼ\t���� ������\t��������\t��Ƽ\t���ڽ�����\t���ũ ������\t��� ��ũƼ\n");
			while(rs.next()) {
				String str = rs.getString("Greentea")+"\t"+rs.getString("DarkchocoMilktea")+"\t"+rs.getString("StrawberrySmoody")+"\t"+rs.getString("MangoSmoody")+"\t"+rs.getString("BlakcTea")+"\t"+rs.getString("ChocoSmoody")+"\t"+rs.getString("KuandkuSmoody")+"\t"+rs.getString("BlackSugerMilktea")+"\n";
				txtResult.append(str);
				
				
			}
			
			
		} catch (Exception e2) {
			System.out.println("actionPerformed err:"+e);
		} 
	}


}
