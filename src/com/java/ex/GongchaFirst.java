package com.java.ex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.java.ex.main.mainClass;

public class GongchaFirst extends JFrame {
	
	public GongchaFirst() {
		JPanel jp = new JPanel(); //jp ��� Jpanel ����
		jp.setLayout(null); // setLayOut �� null�� grid,flow �� ���� �ٵ� �װ� ��������
		JButton btn1 = new JButton("���� ����");// ��ư �̸��� ���� ����
		JButton btn2 = new JButton("�ֹ�"); // ��ư �̸��� �ֹ�
		add(btn1); // ������� �ֹ� ��ư �߰� ���ּ���.
		add(btn2);
		
		btn1.setBounds(30,100,120,100); //��ư ��ġ ���� �޼ҵ�(x��ǥ,y��ǥ,xũ��,yũ��)
		btn2.setBounds(230,100,120,100);
		add(jp); //jp ���� 
		setSize(400,400); // ������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â X������ �ݰԲ� �����
		setTitle("�ֹ� ó��");//���� 
		setVisible(true); //jp���̰� ���ִ� �޼ҵ� false�� �Ⱥ��δ�.
		//btn1�� �������� �߻��ϰԲ� ����°�
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					new GongchaLogin();
					
					dispose(); // ȭ�� �Ⱥ��̰� ���ִ°�
				} catch (Exception e2) {
					
				}
				
			}
		});
		//btn2�� �������� �߻��ϰԲ� ����°�
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