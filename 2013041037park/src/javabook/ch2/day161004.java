package javabook.ch2;

public class day161004 {

	static int num1 = 10;
	int num2 = 10;

	public day161004() {
		System.out.println("按眉 积己 己傍: 秋肺岿靛");
		System.out.println("按眉 积己 肚 己傍");
	}

	public static void main(String[] args) {
		day161004 exam = new day161004();
		day161004 exam2 = new day161004();

		exam.num1 = 20;
		exam2.num1 = 30;
		System.out.println("exam.num1=" + exam.num1);
		System.out.println("exam2.num1=" + exam2.num1);
		exam.num2 = 30;
		exam2.num2 = 50;
		System.out.println("exam.num2=" + exam.num2);
		System.out.println("exam2.num2=" + exam2.num2);
	}

}
