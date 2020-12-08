package com.java.ex;
import com.java.ex.GongchaResult;
import com.java.ex.GongchaSingup;

import dao.MemberDAO;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
public class GongchaLogin extends JFrame{
	
	public GongchaLogin() {
		JPanel jp = new JPanel();
		jp.setLayout(null);
		JLabel label = new JLabel(new ImageIcon("C:\\Users\\김진혁\\Desktop\\Tea\\gongchalogo.png"));
		add(label);
		Label b2 = new Label("아이디:");
		add(b2);
		Label b3 = new Label("비밀번호:");
		add(b3);
		TextField b4 =new TextField();
		add(b4);
		TextField b5 =new TextField();
		add(b5);
		b5.setEchoChar('*');// 비밀번호라서 별표 찍기
		JButton b6 = new JButton("로그인");
		add(b6);
		JButton b7 = new JButton("회원 가입");
		add(b7);
		
		
		label.setBounds(0,5,500,255);
		b2.setBounds(40,265,40,40);
		b3.setBounds(40,305,60,40);
		b4.setBounds(150,265,200,30);
		b5.setBounds(150,305,200,30);
		b6.setBounds(380,265,90,30);
		b7.setBounds(380,305,90,30);
		add(jp);
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("로그인 화면");
		setVisible(true);
		//회원 가입창 
		b7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new GongchaSingup();
				
			}
		});
			b6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String  id = b4.getText();
				String password = b5.getText();
				MemberDAO dao = MemberDAO.getInstance();
				int result = dao.nameAndPassword(id, password);
				if(result == 1) {
					//로그인 성공 메시지
					JOptionPane.showMessageDialog(null, "로그인 성공");
					//현재 화면 종료
					 new GongchaResult();
					dispose();
					
				}else {
					JOptionPane.showMessageDialog(null, "로그인 실패");
				}



				
			}
		});
	}
	
	
}
