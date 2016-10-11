package javabook.ch2;

public class day161011 {
	String msg;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	System클래스.out객체.println메소드("hello world");*/
		
		day161011 hello1 = new day161011();
		hello1.print();
	}
	public day161011(){
		msg="Hello World !!";
	}
	public void print(){
		System.out.println(msg);
	}
}
