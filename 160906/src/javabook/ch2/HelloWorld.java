package javabook.ch2;

import java.util.Scanner;

public class HelloWorld {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3,b=4;
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.printf("%d+%d=%d",a,b,a+b);
		
		
		Scanner sc = new Scanner(System.in);
		int number;
		number = sc.nextInt();    
		if(number>0)
			System.out.println("입력 받은 숫자 : " + number);
		else if(number<=0)
			System.out.println("ㅈㅅ");
		System.out.println("개솔 ㅅㄱ");
		}

}
