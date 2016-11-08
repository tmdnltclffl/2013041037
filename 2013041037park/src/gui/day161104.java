package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Arrays;

import javax.swing.*;
public class day161104 implements ActionListener {

	JFrame frame = new JFrame("메뉴");
	JMenu menu;
	JMenuBar menubar;
	JMenuItem  menu11,menu12,menu13,menu21,menu22,menu23,menu31,menu32,menu33;
	public static void main(String[] args){
		 day161104 menu = new day161104();
	}
	public day161104(){

	
	//메뉴
		menubar = new JMenuBar();
		frame.setJMenuBar(menubar);
		menu = new JMenu("파일");
		menu11 = new JMenuItem("로또");
		menu11.addActionListener(this);
		menu12=new JMenuItem("새파일2");
		menu13=new JMenuItem("새파일3");
		menu.add(menu11);
		menu.add(menu12);
		menu.add(menu13);
		menubar.add(menu);
		
		menu = new JMenu("편집");
		menu21=new JMenuItem("새편집");
		menu22=new JMenuItem("새편집2");
		menu23=new JMenuItem("새편집3");
		menu.add(menu21);
		menu.add(menu22);
		menu.add(menu23);
		menubar.add(menu);
		
		
		menu = new JMenu("보기");
		menu31=new JMenuItem("새검색");
		menu32=new JMenuItem("새보기2");
		menu33=new JMenuItem("새보기3");
		menu.add(menu31);
		menu.add(menu32);
		menu.add(menu33);
		menubar.add(menu);

		//계산기
		JPanel p1 = new JPanel();
		p1.setSize(50,200 );
		p1.setLayout(new GridLayout(4,4,5,5));
		JButton c = new JButton("c");
		JButton plus = new JButton("＋");
		JButton minus = new JButton("－");
		JButton devision = new JButton("/");
		JButton multiplication = new JButton("*");
		JButton B1 = new JButton("1");
		JButton B2 = new JButton("2");
		JButton B3 = new JButton("3");
		JButton B4 = new JButton("4");
		JButton B5 = new JButton("5");
		JButton B6 = new JButton("6");
		JButton B7 = new JButton("7");
		JButton B8 = new JButton("8");
		JButton B9 = new JButton("9");
		JButton B0 = new JButton("0");
		JButton NO = new JButton();
		JButton equal = new JButton("=");
		
		p1.add(B1);
		p1.add(B2);
		p1.add(B3);
		p1.add(devision);
		p1.add(B4);
		p1.add(B5);
		p1.add(B6);
		p1.add(multiplication);
		p1.add(B7);
		p1.add(B8);
		p1.add(B9);
		p1.add(plus);
		p1.add(NO);
		p1.add(B0);
		p1.add(equal);
		p1.add(minus);
		
		JPanel p3 = new JPanel();
		TextField number = new TextField(50);
		number.setEditable(false);//텍스트 파일 못 쓰게
		p3.add(number);
		
		
		
		
		c.addActionListener(this);
		plus.addActionListener(this);
		devision.addActionListener(this);
		multiplication.addActionListener(this);
		B1.addActionListener(this);
		B2.addActionListener(this);
		B3.addActionListener(this);
		B4.addActionListener(this);
		B5.addActionListener(this);
		B6.addActionListener(this);
		B7.addActionListener(this);
		B8.addActionListener(this);
		B9.addActionListener(this);
		B0.addActionListener(this);
		equal.addActionListener(this);
		
		frame.add(p1,BorderLayout.SOUTH);
		frame.add(p3,BorderLayout.NORTH);
		frame.setSize(450,230);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	

		public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String obj = e.getActionCommand();
			if("로또".equals(obj)){
				lotto a = new lotto();
			}
			
	}



}
