package javabook.ch2;

import java.util.Scanner;

public class HelloWorld {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		number = sc.nextInt();    
		if(number>0)
			System.out.println("�Է� ���� ���� : " + number);
		else if(number<=0)
			System.out.println("����");
		System.out.println("���� ����");
		}

}
