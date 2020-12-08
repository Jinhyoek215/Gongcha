package com.java.ex;

import com.java.ex.Exp.*;
import java.awt.Button;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GongchaPictureButton extends JFrame{
	public GongchaPictureButton() {
		Container ct = getContentPane();
		GridLayout gl = new GridLayout(4,5,10,10);
		ct.setLayout(gl);
		
		
		Button btn1 = new Button("그린티");
		add(btn1);
		Button btn2 = new Button("다크 밀크티");
		add(btn2);
		Button btn3 = new Button("딸기 스무디");
		add(btn3);
		Button btn4 = new Button("망고 스무디");
		add(btn4);
		Button btn5 = new Button("블랙티");
		add(btn5);
		Button btn6 = new Button("초코 스무디");
		add(btn6);
		Button btn7 = new Button("쿠앤크 스무디");
		add(btn7);
		Button btn8 = new Button("흑당 밀크티");
		add(btn8);
		
		setTitle("공차 버튼");
		setSize(800,800);
		setVisible(true);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Greentea gt = new Greentea();
					
					dispose(); // 화면 안보이게 해주는거
				} catch (Exception e2) {
					
				}
				
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					darkMilk dm = new darkMilk();
					
					dispose(); // 화면 안보이게 해주는거
				} catch (Exception e2) {
					
				}
				
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					strawberry sb = new strawberry();
					
					dispose(); // 화면 안보이게 해주는거
				} catch (Exception e2) {
					
				}
				
			}
		});
		
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					mango mg = new mango();
					
					dispose(); // 화면 안보이게 해주는거
				} catch (Exception e2) {
					
				}
				
			}
		});
		
		btn5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					blackTea bt = new blackTea();
					
					dispose(); // 화면 안보이게 해주는거
				} catch (Exception e2) {
					
				}
				
			}
		});
		
		btn6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					choco ch = new choco();
					
					dispose(); // 화면 안보이게 해주는거
				} catch (Exception e2) {
					
				}
				
			}
		});
		
		btn7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					cuandku ck = new cuandku();
					
					dispose(); // 화면 안보이게 해주는거
				} catch (Exception e2) {
					
				}
				
			}
		});
		
		btn8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					blackSuger bs = new blackSuger();
					
					dispose(); // 화면 안보이게 해주는거
				} catch (Exception e2) {
					
				}
				
			}
		});
	}
	
	
	public static void main(String[] args) {
		
	}
}