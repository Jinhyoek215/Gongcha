package com.java.ex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.java.ex.main.mainClass;

public class GongchaFirst extends JFrame {
	
	public GongchaFirst() {
		JPanel jp = new JPanel(); //jp 라는 Jpanel 생성
		jp.setLayout(null); // setLayOut 은 null값 grid,flow 도 있음 근데 그걸 지정안함
		JButton btn1 = new JButton("매출 관리");// 버튼 이름은 매출 관리
		JButton btn2 = new JButton("주문"); // 버튼 이름은 주문
		add(btn1); // 매출관리 주문 버튼 추가 해주세요.
		add(btn2);
		
		btn1.setBounds(30,100,120,100); //버튼 위치 관련 메소드(x좌표,y좌표,x크기,y크기)
		btn2.setBounds(230,100,120,100);
		add(jp); //jp 생성 
		setSize(400,400); // 사이즈
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 X누르면 닫게끔 만들기
		setTitle("주문 처리");//제목 
		setVisible(true); //jp보이게 해주는 메소드 false면 안보인다.
		//btn1을 눌럿을때 발생하게끔 만드는것
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					new GongchaLogin();
					
					dispose(); // 화면 안보이게 해주는거
				} catch (Exception e2) {
					
				}
				
			}
		});
		//btn2을 눌럿을때 발생하게끔 만드는것
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					  new GongchaOrder();
					dispose();
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
			}
		});
	}	
}