package javabook.ch2;

public class day161011 {
	String msg;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	System클래스.out객체.println메소드("hello world");*/
		
		day161011 hello1 = new day161011();
		hello1.print();
		day161011 hello2 = new day161011("My Hello World!!");
		hello2.print();
		day161011 hello3 = new day161011("박경훈");
		hello3.print();
		day161011 hello4 = new day161011("Hello",2);
		hello4.print();
		hello2.setMsg("반갑습니다!!");
		System.out.println(hello2.getMsg());
	}
	public day161011(){
		msg="Hello World !!";
	}
	public day161011(String msg){
		this.msg=msg;
	}
	public day161011(String msg,int option){
		if(option==1)
			this.msg=msg;
		else if(option==2)
			this.msg=msg+", 안녕하세요?";
	}
	public void print(){
		System.out.println(msg);
	}
	
	public String getMsg(){
		return msg;
	}
	public void setMsg(String msg){
		this.msg=msg;
	}
	
	

}
