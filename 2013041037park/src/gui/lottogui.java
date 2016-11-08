package gui;

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

		p2.add(btn);
		JLabel label = new JLabel(Arrays.toString(arr));
		p1.add(label);
		btn.addActionListener(this);
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.SOUTH);

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
