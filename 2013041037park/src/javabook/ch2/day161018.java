package javabook.ch2;

import java.util.Scanner;

public class day161018 {
	public static void main(String[] args) {
		/*
		 * String str1 = "hello"; String str2 = "hello"; String str3 = new
		 * String("hello");
		 * 
		 * //String str4 = new String(30); //���������� ���� �ʾ� ������ �߻��Ѵ�. String str4 =
		 * String.valueOf(30);
		 * 
		 * String num1 = "20";
		 * 
		 * if ( str1==str2) System.out.println("str1�� str2�� �����ϴ�!"); else
		 * System.out.println("str1�� str2�� ���� �ʽ��ϴ�!"); if ( str1==str3)
		 * System.out.println("str1�� str3�� �����ϴ�!"); else
		 * System.out.println("str1�� str3�� ���� �ʽ��ϴ�!"); if ( str1.equals(str3))
		 * System.out.println("str1�� str3�� �����ϴ�!"); else
		 * System.out.println("str1�� str3�� ���� �ʽ��ϴ�!");
		 * 
		 * 
		 * System.out.println("num1+30 = " + num1+30);
		 * System.out.println("str1�� ����: " + str1.length());
		 * System.out.println("str1�� 4��° ����: "+str1.charAt(4));
		 * System.out.println("str1�� 2~4 ��ġ�� �ִ� ���ڿ�: " + str1.substring(1, 4));
		 * System.out.println("str1�� 1�� k �� ġȯ: "+str1.replace('1', 'k'));
		 */

		/*
		 * String str = "���ڿ�"; for(int i=0;i<50;i++){ str=str+i; }
		 * System.out.println(str); StringBuffer sb=new StringBuffer();
		 * sb.append("���ڿ�"); for(int i=0;i<50;i++){ sb.append(i); }
		 * System.out.println(sb.toString());
		 */

		/*Integer num1 = new Integer(30);
		Integer num2 = num1.intValue();
		Integer num3 = 50;

		int num4 = num3;
		String num5 = "40";

		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("num3: " + num3);
		System.out.println("num4: " + num4);

		System.out.println("MAX_VALUE: " + Integer.MAX_VALUE);
		System.out.println("SIZE: " + Integer.SIZE);

		int result = num1 + Integer.parseInt(num5);
		System.out.println("num1+num5 = " + result);
*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ȯ�溯�� PATH: "+System.getenv("PATH"));
		System.setProperty("user", "ȫ�浿");
		System.out.println("user �Ӽ���:  "+System.getenv("user"));
		
		System.out.println("�����Ϸ��� x �� ��������!!");
		while(true){
			if(scanner.next().equals("x")){
				System.out.println("���α׷�������!!");
				System.exit(0);
			}
			else
				System.out.println("�ٽ� �Է��ϼ���!!");
			
		}
		

/*		String msg = scan.next();
		System.out.println("�Է�: " + msg);
		int num = scan.nextInt();
		System.out.println("�Է�: "+num);*/
		
		
	
		
	}

}
