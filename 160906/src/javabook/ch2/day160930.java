package javabook.ch2;

public class day160930 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int[] arr = {10, 20, 30, 40, 50};
		// int sum = 0;
		// for(int i=0;i<arr.length;i++){
		// sum += arr[i];
		// }
		// System.out.println("sum="+sum);

		// int[][] arr = {
		// { 5, 5, 5, 5, 5},
		// {10,10,10,10,10},
		// {20,20,20,20,20},
		// {30,30,30,30,30}
		// };
		// int total = 0;
		// float average = 0;
		// for(int i=0;i<arr.length;i++){
		// average += arr[i].length;
		// for(int h=0;h<arr[i].length;h++){
		// total += arr[i][h];
		// }
		// }
		// average = total/average;
		// System.out.println("total="+total);
		// System.out.println("average="+average);

		// int[] ballArr = {1,2,3,4,5,6,7,8,9};
		// int[] ball3 = new int[3];
		// // 배열 ballArr의 임의의 요소 2개를 골라서 위치를 바꾼다. 20번 반복
		// for(int x=0;x < 20;x++) {
		// int i = (int)(Math.random() * ballArr.length);
		// int j = (int)(Math.random() * ballArr.length);
		// int tmp = 0;
		// tmp = ballArr[i];
		// ballArr[i]=ballArr[j];
		// ballArr[j]=tmp;
		// }
		// // 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
		// for(int y=0;y<3;y++){
		// ball3[y]=ballArr[y];
		// }
		// for(int i=0;i<ball3.length;i++) {
		// System.out.print(ball3[i]);
		// }

		// 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
		// int[] coinUnit = {500, 100, 50, 10};
		// int money = 2680;
		// System.out.println("money="+money);
		// for(int i=0;i<coinUnit.length;i++) {
		// System.out.println(coinUnit[i]+"원: "+money/coinUnit[i]);
		// money -= money/coinUnit[i]*coinUnit[i];
		// }

		/*
		 * if(args.length!=1) {
		 * System.out.println("USAGE: java Exercise5_7 3120"); System.exit(0); }
		 * // 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다. int money =
		 * Integer.parseInt(args[0]); System.out.println("money="+money); int[]
		 * coinUnit = {500, 100, 50, 10 }; // 동전의 단위 int[] coin = {5, 5, 5, 5};
		 * // 단위별 동전의 개수 for(int i=0;i<coinUnit.length;i++) { int coinNum = 0;
		 * // (1) 아래의 로직에 맞게 코드를 작성하시오. //1. 금액(money)을 동전단위로 나눠서 필요한 동전의
		 * 개수(coinNum)를 구한다. coinNum =money/coinUnit[i]; // 2. 배열 coin에서
		 * coinNum만큼의 동전을 뺀다. // (만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다.)
		 * if(coinNum>coin[i]){ coinNum=coin[i]; } coin[i] -= coinNum; // 3.
		 * 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다. money -= coinNum*coinUnit[i];
		 * System.out.println(coinUnit[i]+"원: "+coinNum); } if(money > 0) {
		 * System.out.println("거스름돈이 부족합니다."); System.exit(0); // 프로그램을 종료한다. }
		 * System.out.println("=남은 동전의 개수 ="); for(int
		 * i=0;i<coinUnit.length;i++) {
		 * System.out.println(coinUnit[i]+"원:"+coin[i]); }
		 */

		/*
		 * int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 }; int[] counter = new int[4];
		 * for(int i=0; i < answer.length;i++) { for(int a=0;a<4;a++) {
		 * if(answer[i]==a+1){ counter[a] +=1; } } } for(int i=0; i <
		 * counter.length;i++) { System.out.print(counter[i]); for(int
		 * a=0;a<counter[i];a++){ System.out.print("*"); } System.out.println();
		 * }
		 */

		/*
		 * char[][] star = { {'*','*',' ',' ',' '}, {'*','*',' ',' ',' '},
		 * {'*','*','*','*','*'}, {'*','*','*','*','*'} }; char[][] result = new
		 * char[star[0].length][star.length]; for(int i=0; i < star.length;i++)
		 * { for(int j=0; j < star[i].length;j++) {
		 * System.out.print(star[i][j]); } System.out.println(); }
		 * System.out.println(); for(int i=0; i < star.length;i++) { for(int
		 * j=0; j < star[i].length;j++) { result[j][i]=star[star.length-1-i][j];
		 * } } for(int i=0; i < result.length;i++) { for(int j=0; j <
		 * result[i].length;j++) { System.out.print(result[i][j]); }
		 * System.out.println(); }
		 */

		/*
		 * char[] abcCode = { '`','~','!','@','#','$','%','^','&','*',
		 * '(',')','-','_','+','=','|','[',']','{', '}',';',':',',','.','/'}; //
		 * 0 1 2 3 4 5 6 7 8 9 char[] numCode =
		 * {'q','w','e','r','t','y','u','i','o','p'}; String src = "abc123";
		 * String result = ""; // 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에
		 * 저장 for(int i=0; i < src.length();i++) { char ch = src.charAt(i);
		 * if(48<=(int)ch && (int)ch<=57){ result += numCode[(int)ch-48];
		 * System.out.println("result:"+numCode[(int)ch-48]); } else{ result +=
		 * abcCode[(int)ch-97]; } } System.out.println("src:"+src);
		 * System.out.println("result:"+result);
		 */

		int[][] score = { { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 }, { 40, 40, 40 }, { 50, 50, 50 } };
		int[][] result = new int[score.length + 1][score[0].length + 1];
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				int sum = 0;
				sum += score[i][j];
				if (j == score.length) {
					result[i][j + 1] = sum;
				}
			}
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%4d", result[i][j]);
			}
			System.out.println();
		}

	}

}
