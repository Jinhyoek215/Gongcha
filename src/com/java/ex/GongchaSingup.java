package com.java.ex;

import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import dao.Member;
import dao.MemberDAO;

public class GongchaSingup extends JFrame {
	public GongchaSingup(){
		JPanel jp = new JPanel();
		Label l1 = new Label("아이디");
		Label l2 = new Label("패스워드");
		Label l3 = new Label("이름");
		Label l4 = new Label("이메일");
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);

		TextField t1 = new TextField();
		TextField t2 = new TextField();
		TextField t3 = new TextField();
		TextField t4 = new TextField();

		add(t1);
		add(t2);
		add(t3);
		add(t4);

		t2.setEchoChar('*');
		JButton btn1 = new JButton("저장");
		JButton btn2 = new JButton("취소");
		add(btn1);
		add(btn2);
		
		l1.setBounds(40,10,60,60);
		l2.setBounds(40,50,60,60);
		l3.setBounds(40,90,60,60);
		l4.setBounds(40,130,60,60);

		
		t1.setBounds(120,10,200,30);
		t2.setBounds(120,50,200,30);
		t3.setBounds(120,90,200,30);
		t4.setBounds(120,130,280,30);

		
		btn1.setBounds(125,330,80,30);
		btn2.setBounds(240,330,80,30);
		add(jp);
		setSize(500,500);
		setTitle("회원 가입");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Member member = new Member();
				member.setId(t1.getText());
				member.setPassword(t2.getText());
				member.setName(t3.getText());
				member.setEmail(t4.getText());
				
				MemberDAO dao = MemberDAO.getInstance();
				int result = dao.save(member);
				
				if(result == 1) {
					JOptionPane.showMessageDialog(null, "회원가입이 완료되었습니다.");
					dispose();
				}else {
					JOptionPane.showMessageDialog(null, "회원가입이 실패하였습니다.");
					dispose();
				}	
			}
		});
	btn2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			
		}
	});
	
	}



			
	}