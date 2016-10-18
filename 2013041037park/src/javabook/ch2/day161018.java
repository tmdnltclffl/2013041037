package javabook.ch2;

import java.util.Scanner;

public class day161018 {
	public static void main(String[] args) {
		/*
		 * String str1 = "hello"; String str2 = "hello"; String str3 = new
		 * String("hello");
		 * 
		 * //String str4 = new String(30); //데이터형이 맞지 않아 오류가 발생한다. String str4 =
		 * String.valueOf(30);
		 * 
		 * String num1 = "20";
		 * 
		 * if ( str1==str2) System.out.println("str1과 str2는 같습니다!"); else
		 * System.out.println("str1과 str2는 같지 않습니다!"); if ( str1==str3)
		 * System.out.println("str1과 str3는 같습니다!"); else
		 * System.out.println("str1과 str3는 같지 않습니다!"); if ( str1.equals(str3))
		 * System.out.println("str1과 str3는 같습니다!"); else
		 * System.out.println("str1과 str3는 같지 않습니다!");
		 * 
		 * 
		 * System.out.println("num1+30 = " + num1+30);
		 * System.out.println("str1의 길이: " + str1.length());
		 * System.out.println("str1의 4번째 문자: "+str1.charAt(4));
		 * System.out.println("str1의 2~4 위치에 있는 문자열: " + str1.substring(1, 4));
		 * System.out.println("str1의 1을 k 로 치환: "+str1.replace('1', 'k'));
		 */

		/*
		 * String str = "문자열"; for(int i=0;i<50;i++){ str=str+i; }
		 * System.out.println(str); StringBuffer sb=new StringBuffer();
		 * sb.append("문자열"); for(int i=0;i<50;i++){ sb.append(i); }
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
		
		System.out.println("환경변수 PATH: "+System.getenv("PATH"));
		System.setProperty("user", "홍길동");
		System.out.println("user 속성값:  "+System.getenv("user"));
		
		System.out.println("종료하려면 x 를 누르세요!!");
		while(true){
			if(scanner.next().equals("x")){
				System.out.println("프로그램종료함!!");
				System.exit(0);
			}
			else
				System.out.println("다시 입력하세요!!");
			
		}
		

/*		String msg = scan.next();
		System.out.println("입력: " + msg);
		int num = scan.nextInt();
		System.out.println("입력: "+num);*/
		
		
	
		
	}

}
