package com.java.ex.Exp;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


import com.java.ex.GongchaOrder;

public class blackSuger extends JFrame{

	JTable table;
	String[] []data;
	JScrollPane scroll;
	String[] title = {"�޴���","��ȸ ������(g)","Į�θ�(kcal)","���(g)","�ܹ���(g)","��ȭ����(g)","��Ʈ��(mg)","ī����(mg)"};
	public blackSuger() {
		Color a = new Color(200,255,0);
		JPanel jp = new JPanel();
		jp.setLayout(null);		
		jp.setBackground(a);
		JLabel label = new JLabel(new ImageIcon("C:\\Users\\������\\Desktop\\Tea\\BlackSuger.jpg"));
		JLabel label1 = new JLabel("��� ��ũƼ");
		JLabel label2 = new JLabel("Large : 5,300��");
		JLabel label4 = new JLabel("�ε巴�� ������ ���� ��󸮿�");
		JLabel label5 = new JLabel("�ż��� ������ ���� ��������(HOT/ICED");
		JButton btn1 = new JButton("���ư���");
		add(btn1);
		
		add(label1);
		add(label2);
		add(label4);
		add(label5);
		add(label);
		label1.setBounds(550,50,150,150);
		label2.setBounds(550,150,300,300);
		label4.setBounds(550,100,200,200);
		label5.setBounds(550,120,300,200);
		label.setBounds(50,130,300,300);
		btn1.setBounds(800,300,100,100);
		
		
		add(jp);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("�׸�Ƽ");
		setVisible(true);
		
		Color b = new Color(100,100,50);
		JPanel jp2 = new JPanel();
		jp2.setLayout(null);
		jp2.setBackground(b);
		
		add(jp2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		table = new JTable(10,10);
		data = new String[2][10];
		  data[0][0]="��� ��ũƼ(ice)";
		  data[0][1]="454";
		  data[0][2]="313.6";
		  data[0][3]="35.1";
		  data[0][4]="7.1";
		  data[0][5]="6.4";
		  data[0][6]="153.6";
		  data[0][7]="0.0";
				  
		   
		  data[1][0]="��� ��ũƼ(hot)";
		  data[1][1]="454";
		  data[1][2]="417.4";
		  data[1][3]="39";
		  data[1][4]="10.2";
		  data[1][5]="9.3";
		  data[1][6]="195.4";
		  data[1][7]="0";
		  
	
		  
		  table=new JTable(data,title); // table=new JTable(������-2�����迭, �÷��迭);
		  scroll = new JScrollPane(table);
		  add(scroll);
		  this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		  pack();
		  scroll.setPreferredSize(new Dimension(100,100));

		 
		  setSize(1000,500);
		  setVisible(true);
		  
			add(btn1);
		  btn1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					try {
						 new GongchaOrder();
						
						dispose(); // ȭ�� �Ⱥ��̰� ���ִ°�
					} catch (Exception e2) {
						
					}
					
				}
			});
		
	}
	public static void main(String[] args) {
		new blackSuger();
	}
}