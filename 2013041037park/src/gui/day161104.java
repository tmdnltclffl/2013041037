package gui;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

import javax.swing.*;
public class day161104 implements ActionListener {
	JFrame frame = new JFrame("�޴�");
	JMenu menu;
	JMenuBar menubar;
	JMenuItem  menu11,menu12,menu13,menu21,menu22,menu23,menu31,menu32,menu33;
	public static void main(String[] args){
		 day161104 menu = new day161104();
	}
	public day161104(){

	
		menubar = new JMenuBar();
		frame.setJMenuBar(menubar);
		menu = new JMenu("����");
		menu11 = new JMenuItem("�ζ�");
		menu11.addActionListener(this);
		menu12=new JMenuItem("������2");
		menu13=new JMenuItem("������3");
		menu.add(menu11);
		menu.add(menu12);
		menu.add(menu13);
		menubar.add(menu);
		
		menu = new JMenu("����");
		menu21=new JMenuItem("������");
		menu22=new JMenuItem("������2");
		menu23=new JMenuItem("������3");
		menu.add(menu21);
		menu.add(menu22);
		menu.add(menu23);
		menubar.add(menu);
		
		
		menu = new JMenu("����");
		menu31=new JMenuItem("���˻�");
		menu32=new JMenuItem("������2");
		menu33=new JMenuItem("������3");
		menu.add(menu31);
		menu.add(menu32);
		menu.add(menu33);
		menubar.add(menu);

		
		


		frame.setSize(250,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	

		public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String obj = e.getActionCommand();
			if("�ζ�".equals(obj)){
				lotto a = new lotto();
			}
			
	}



}
