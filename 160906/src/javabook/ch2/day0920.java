package javabook.ch2;
import java.awt.*;



public class day0920 extends Frame{
	public day0920(){
		super("AWT 기본예제");
		setLayout(new BorderLayout());
		Label t1 = new Label("ID");
		Label t2 = new Label("Passwd");
		TextField id = new TextField(10);
		TextField pwd = new TextField(10);
		Button btn = new Button("Login");
		Panel p1 = new Panel();
		
		p1.add(t1);
		p1.add(id);
		Panel p2 = new Panel();
		p2.add(t2);
		p2.add(pwd);
		p2.add(btn);
		
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.SOUTH);
		
		setSize(250,200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day0920 app= new day0920();
	}
}
