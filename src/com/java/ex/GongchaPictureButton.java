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
		
		
		Button btn1 = new Button("�׸�Ƽ");
		add(btn1);
		Button btn2 = new Button("��ũ ��ũƼ");
		add(btn2);
		Button btn3 = new Button("���� ������");
		add(btn3);
		Button btn4 = new Button("���� ������");
		add(btn4);
		Button btn5 = new Button("��Ƽ");
		add(btn5);
		Button btn6 = new Button("���� ������");
		add(btn6);
		Button btn7 = new Button("���ũ ������");
		add(btn7);
		Button btn8 = new Button("��� ��ũƼ");
		add(btn8);
		
		setTitle("���� ��ư");
		setSize(800,800);
		setVisible(true);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Greentea gt = new Greentea();
					
					dispose(); // ȭ�� �Ⱥ��̰� ���ִ°�
				} catch (Exception e2) {
					
				}
				
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					darkMilk dm = new darkMilk();
					
					dispose(); // ȭ�� �Ⱥ��̰� ���ִ°�
				} catch (Exception e2) {
					
				}
				
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					strawberry sb = new strawberry();
					
					dispose(); // ȭ�� �Ⱥ��̰� ���ִ°�
				} catch (Exception e2) {
					
				}
				
			}
		});
		
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					mango mg = new mango();
					
					dispose(); // ȭ�� �Ⱥ��̰� ���ִ°�
				} catch (Exception e2) {
					
				}
				
			}
		});
		
		btn5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					blackTea bt = new blackTea();
					
					dispose(); // ȭ�� �Ⱥ��̰� ���ִ°�
				} catch (Exception e2) {
					
				}
				
			}
		});
		
		btn6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					choco ch = new choco();
					
					dispose(); // ȭ�� �Ⱥ��̰� ���ִ°�
				} catch (Exception e2) {
					
				}
				
			}
		});
		
		btn7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					cuandku ck = new cuandku();
					
					dispose(); // ȭ�� �Ⱥ��̰� ���ִ°�
				} catch (Exception e2) {
					
				}
				
			}
		});
		
		btn8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					blackSuger bs = new blackSuger();
					
					dispose(); // ȭ�� �Ⱥ��̰� ���ִ°�
				} catch (Exception e2) {
					
				}
				
			}
		});
	}
	
	
	public static void main(String[] args) {
		
	}
}