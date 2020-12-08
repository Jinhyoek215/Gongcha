package com.java.ex;

import java.awt.BorderLayout;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.omg.CORBA.INITIALIZE;

import dao.Gongcha;
import dao.GongchaDAO;

import java.io.FileWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.imageio.ImageIO;
public class GongchaOrder extends JFrame{

	int sum1=0;
	
	int Glabel1=0;//�׸�Ƽ
	int Dlabel1=0; // ��ũ ���� ��ũƼ
	int Slabel1=0; //���� ������
	int Mlabel1=0; // ���� ������
	int Blabel1=0;// ��Ƽ
	int Clabel1=0;// ��Ű
	int Klabel1=0;//���ũ
	int BSlabel1=0;//��� 
	
	int Glabel2=0;//�׸�Ƽ
	int Dlabel2=0; // ��ũ ���� ��ũƼ
	int Slabel2=0; //���� ������
	int Mlabel2=0; // ���� ������
	int Blabel2=0;// ��Ƽ
	int Clabel2=0;// ��Ű
	int Klabel2=0;//���ũ
	int BSlabel2=0;//��� 
	//
	JTable table;
	JScrollPane scrollPane;
	
	//
	public GongchaOrder() {
	
		JPanel jp = new JPanel();
		
		TextArea textArea = new TextArea("�ֹ�ǥ");
		jp.add(textArea);
	
		jp.setLayout(null);
		jp.setPreferredSize(new Dimension(950,100));
		
		JLabel labelTitle =new JLabel("�ȳ��ϼ���!! ���� �Դϴ� !!");
		labelTitle.setBounds(100,50,200,200);
		
		textArea.setBounds(40,400,500,300);
		
		
	
	
		JLabel Glabel = new JLabel("0");
		JLabel Dlabel = new JLabel("0");
		JLabel Slabel = new JLabel("0");
		JLabel Mlabel = new JLabel("0");
		JLabel Blabel = new JLabel("0");
		JLabel Clabel = new JLabel("0");
		JLabel Klabel = new JLabel("0");
		JLabel BSlabel = new JLabel("0");
		JLabel sum = new JLabel("0");

		
		JButton Gbtn1 = new JButton("�׸�Ƽ");
		JButton Gbtn2 = new JButton("��");
		JButton Gbtn3 = new JButton("��");
		
		JButton Dbtn1 = new JButton("��ũ ���� ��ũƼ");
		JButton Dbtn2 = new JButton("��");
		JButton Dbtn3 = new JButton("��");
		
		JButton Sbtn1 = new JButton("���� ������");
		JButton Sbtn2 = new JButton("��");
		JButton Sbtn3 = new JButton("��");
		
		JButton Mbtn1 = new JButton("���� ������");
		JButton Mbtn2 = new JButton("��");
		JButton Mbtn3 = new JButton("��");
		
		JButton Bbtn1 = new JButton("��Ƽ");
		JButton Bbtn2 = new JButton("��");
		JButton Bbtn3 = new JButton("��");
		
				
		JButton Cbtn1 = new JButton("���� ������");
		JButton Cbtn2 = new JButton("��");
		JButton Cbtn3 = new JButton("��");
		
		JButton Kbtn1 = new JButton("���ũ ������");
		JButton Kbtn2 = new JButton("��");
		JButton Kbtn3 = new JButton("��");
		
		JButton BSbtn1 = new JButton("��� ��ũƼ");
		JButton BSbtn2 = new JButton("��");
		JButton BSbtn3 = new JButton("��");
		
		JButton picture = new JButton("�׸� ����");
		JButton cash = new JButton("���� �ϱ�");
		JButton back = new JButton("�ڷ� ����");
		
		
		
		
		//�� �߰� ����
		add(sum);
		add(labelTitle);
		labelTitle.setBounds(300,-180,700,400);		
		
		// ��ư �߰� ����
		add(Glabel);
		
		add(Gbtn1);// �׸�Ƽ
		add(Gbtn2);
		add(Gbtn3);
		
		add(Dlabel);
		add(Dbtn1);// ��ũ ���� ������
		add(Dbtn2);
		add(Dbtn3);
		
		add(Slabel);		
		add(Sbtn1);// ���� ������
		add(Sbtn2);
		add(Sbtn3);
		
		add(Mlabel);
		add(Mbtn1);// ���� ������
		add(Mbtn2);
		add(Mbtn3);
		
		add(Blabel);
		add(Bbtn1);//��Ƽ
		add(Bbtn2);
		add(Bbtn3);
		
		add(Clabel);
		add(Cbtn1); // ���� ������
		add(Cbtn2);
		add(Cbtn3);
		
		add(Klabel);
		add(Kbtn1);//���ũ ������
		add(Kbtn2);
		add(Kbtn3);
		
		add(BSlabel);
		add(BSbtn1);//��� ��ũƼ
		add(BSbtn2);
		add(BSbtn3);
		
		add(back);
		add(picture);
		add(cash); //���� ��ư
		
		//�� ��ư
		sum.setBounds(80,650,150,150);
		
		Glabel.setBounds(80,30,50,50);
		Gbtn1.setBounds(40,70,100,120);
		Gbtn2.setBounds(150,70,50,50);
		Gbtn3.setBounds(150,140,50,50);
		
		Slabel.setBounds(260,30,50,50);
		Sbtn1.setBounds(220,70,100,120);
		Sbtn2.setBounds(330,70,50,50);
		Sbtn3.setBounds(330,140,50,50);
		
		Blabel.setBounds(430,30,50,50);
		Bbtn1.setBounds(400,70,100,120);
		Bbtn2.setBounds(510,70,50,50);
		Bbtn3.setBounds(510,140,50,50);
		
		Klabel.setBounds(600,30,50,50);
		Kbtn1.setBounds(580,70,100,120);
		Kbtn2.setBounds(690,70,50,50);
		Kbtn3.setBounds(690,140,50,50);
		
		// �Ʒ� ��ư
		Dlabel.setBounds(80,230,50,50);
		Dbtn1.setBounds(40,270,100,120);
		Dbtn2.setBounds(150,270,50,50);
		Dbtn3.setBounds(150,340,50,50);
		
		Mlabel.setBounds(260,230,50,50);
		Mbtn1.setBounds(220,270,100,120);
		Mbtn2.setBounds(330,270,50,50);
		Mbtn3.setBounds(330,340,50,50);
	
		Clabel.setBounds(430,230,50,50);
		Cbtn1.setBounds(400,270,100,120);
		Cbtn2.setBounds(510,270,50,50);
		Cbtn3.setBounds(510,340,50,50);
			
		BSlabel.setBounds(600,230,50,50);
		BSbtn1.setBounds(580,270,100,120);
		BSbtn2.setBounds(690,270,50,50);
		BSbtn3.setBounds(690,340,50,50);
		
		picture.setBounds(580,440,140,60);
		cash.setBounds(580,640,140,60);
		back.setBounds(580,540,140,60);
		// panel �߰�

		add(jp);
		setSize(800,800);
		setTitle("�ֹ� ");
		setVisible(true);
		
		
	
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new GongchaFirst();
				dispose();
			}
		});
		
		cash.addActionListener(new ActionListener() {
			//���� ��ư �������� if�� ����ؼ� dao Ŭ������ �ִ� Gongcha Ŭ���� �̿�
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==cash) {
					Gongcha gongcha = new Gongcha();
					gongcha.setGreenTea(Glabel2);  //3500
					gongcha.setDarkchocoMilktea(Dlabel2); 
					gongcha.setStrawberrySmoody(Slabel2);
					gongcha.setMangoSmoody(Mlabel2);
					gongcha.setBlakcTea(Blabel2);
					gongcha.setChocoSmoody(Clabel2);
					gongcha.setKuandkuSmoody(Klabel2);
					gongcha.setBlackSugerMilktea(BSlabel2);
					
					GongchaDAO gongchadao = GongchaDAO.getInstance();
					int result = gongchadao.Morning(gongcha);
		
					sum1=Glabel2+Dlabel2+Slabel2+Mlabel2+Blabel2+Clabel2+Klabel2+BSlabel2;
					textArea.setText("�׸�Ƽ :"+Glabel1+"\n"+"��ũ���� ��ũƼ:"+Dlabel1+"\n"+"���� ������:"+Slabel1+"\n"+"���� ������:"+Mlabel1+"\n"+"��Ƽ:"+Blabel1+"\n"+"���� ������:"+Clabel1+"\n"+"���ũ ������:"+Klabel1+"\n"+"��� ��ũƼ:"+BSlabel1+"\n");
					sum.setText("����:"+sum1);
				}
				
			}
		});
		
		picture.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 new GongchaPictureButton();
				dispose();
				
			}
		});
		 
	
		// �׸�Ƽ �������� ���� �ö󰡰�
		Gbtn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == Gbtn2) {
					Glabel1++;
					Glabel2+=3500;
					Glabel.setText(Glabel1+"");
					

				}

			}
		});
		Gbtn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == Gbtn3) {
					Glabel1--;
					Glabel2-=3500;
					Glabel.setText(Glabel1+"");
					

				}

			}
		});
		// ��ũ���� ��ũƼ �������� ���� �ö󰡰�
		Dbtn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == Dbtn2) {
					Dlabel1++;
					Dlabel2+=4000;
					Dlabel.setText(Dlabel1+"");
				}

			}
		});
		Dbtn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == Dbtn3) {
					Dlabel1--;
					Dlabel2-=4000;
					Dlabel.setText(Dlabel1+"");
				}

			}
		});
		
		Sbtn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == Sbtn2) {
					Slabel1++;
					Slabel2+=5300;
					Slabel.setText(Slabel1+"");
				}

			}
		});
		Sbtn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == Sbtn3) {
					Slabel1--;
					Slabel2-=5300;
					Slabel.setText(Slabel1+"");
				}

			}
		});
		// ���� ������ ���ٿ�
		Mbtn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == Mbtn2) {
					Mlabel1++;
					Mlabel2+=5300;
					Mlabel.setText(Mlabel1+"");
				}

			}
		});
		Mbtn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == Mbtn3) {
					Mlabel1--;
					Mlabel2-=5300;
					Mlabel.setText(Mlabel1+"");
				}

			}
		});
		//��Ƽ �� �ٿ�
		Bbtn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == Bbtn2) {
					Blabel1++;
					Blabel2+=3500;
					Blabel.setText(Blabel1+"");
				}

			}
		});
		Bbtn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == Bbtn3) {
					Blabel1--;
					Blabel2-=3500;
					Blabel.setText(Blabel1+"");
				}

			}
		});
		//��Ű 
		Cbtn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == Cbtn2) {
					Clabel1++;
					Clabel2+=5000;
					Clabel.setText(Clabel1+"");
				}

			}
		});
		Cbtn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == Cbtn3) {
					Clabel1--;
					Clabel2-=5000;
					Clabel.setText(Clabel1+"");
				}

			}
		});
		
		Kbtn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == Kbtn2) {
					Klabel1++;
					Klabel2+=5500;
					Klabel.setText(Klabel1+"");
				}

			}
		});
		Kbtn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == Kbtn3) {
					Klabel1--;
					Klabel2-=5500;
					Klabel.setText(Klabel1+"");
				}

			}
		});
		
		BSbtn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == BSbtn2) {
					BSlabel1++;
					BSlabel2+=5300;
					BSlabel.setText(BSlabel1+"");
				}

			}
		});
		BSbtn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == BSbtn3) {
					BSlabel1--;
					BSlabel2-=5300;
					BSlabel.setText(BSlabel1+"");
				}

			}
		});
		
	}
	
	
}


///