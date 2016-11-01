package javabook.ch2;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

import javax.swing.*;
public class lottogui extends JFrame implements ActionListener {
	Button btn = new Button("¹øÈ£ ÃßÃ·");
	
	public lottogui(int[] arr){
		super("Hello World");
		
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();
		
		TextField tx1 = new TextField(2);
		TextField tx2 = new TextField(2);
		TextField tx3 = new TextField(2);
		TextField tx4 = new TextField(2);
		TextField tx5 = new TextField(2);
		TextField tx6 = new TextField(2);
		p3.add(tx1);
		p3.add(tx2);
		p3.add(tx3);
		p3.add(tx4);
		p3.add(tx5);
		p3.add(tx6);
		p2.add(btn);
		JLabel label = new JLabel(Arrays.toString(arr));
		p1.add(label);
		btn.addActionListener(this);
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.SOUTH);
		add(p3,BorderLayout.CENTER);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(350,150);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		if(obj==btn){
			dispose();
			lotto a=new lotto();
			a.lotto();
		}
	}

}
