package com.java.ex.Exp;

import java.awt.Color;
import java.awt.Dimension;
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

public class cuandku extends JFrame{

	JTable table;
	String[] []data;
	JScrollPane scroll;
	String[] title = {"메뉴명","일회 제공량(g)","칼로리(kcal)","당류(g)","단백질(g)","포화지방(g)","나트륨(mg)","카페인(mg)"};
	public cuandku() {
		Color a = new Color(200,255,0);
		JPanel jp = new JPanel();
		jp.setLayout(null);		
		jp.setBackground(a);
		JLabel label = new JLabel(new ImageIcon("C:\\Users\\김진혁\\Desktop\\Tea\\KNKdy1.png"));
		JLabel label1 = new JLabel("쿠앤크 스무디");
		JLabel label2 = new JLabel("Large : 5,500원");
		JLabel label4 = new JLabel("달콤한 초코 스무디에 달콤짭조름");
		JLabel label5 = new JLabel("초콜렛 과 즐기는 초코 스무디(HOT/ICED");

		

		  JButton btn1 = new JButton("돌아가기");
		  btn1.setBounds(800,300,100,100);
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
		
		
		add(jp);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("쿠앤크 스무디");
		setVisible(true);
		
		Color b = new Color(100,100,50);
		JPanel jp2 = new JPanel();
		jp2.setLayout(null);
		jp2.setBackground(b);
		
		add(jp2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		table = new JTable(10,10);
		data = new String[1][10];
		  data[0][0]="초코 스무디(ice)";
		  data[0][1]="454";
		  data[0][2]="343.8";
		  data[0][3]="29.5";
		  data[0][4]="9.4";
		  data[0][5]="6.7";
		  data[0][6]="252.0";
		  data[0][7]="23.0";
				  
		   
	
		  
	
		  
		  table=new JTable(data,title); // table=new JTable(데이터-2차원배열, 컬럼배열);
		  scroll = new JScrollPane(table);
		  add(scroll);
		  this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		  pack();
		  scroll.setPreferredSize(new Dimension(100,100));

		 
		  setSize(1000,500);
		  setVisible(true);
		  
		  
		  btn1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					try {
						 new GongchaOrder();
						
						dispose(); // 화면 안보이게 해주는거
					} catch (Exception e2) {
						
					}
					
				}
			});
		
	}
	public static void main(String[] args) {
		new cuandku();
	}
}
