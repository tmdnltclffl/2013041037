package javabook.ch2;

import java.util.Scanner;

public class HelloWorld {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��� �ڹ� 2013041037 �ڰ���");
		System.out.println("World's End DanceHall 2013041037 �ڰ���");
		System.out.println("Hellow Dance World 2013041037 �ڰ���");
		Scanner sc = new Scanner(System.in);
		int number;
		number = sc.nextInt();    
		if(number>0)
			System.out.println("�Է� ���� ���� : " + number);
		else if(number<=0)
			System.out.println("����");
		}

}
