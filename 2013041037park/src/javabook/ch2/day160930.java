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
		// // �迭 ballArr�� ������ ��� 2���� ��� ��ġ�� �ٲ۴�. 20�� �ݺ�
		// for(int x=0;x < 20;x++) {
		// int i = (int)(Math.random() * ballArr.length);
		// int j = (int)(Math.random() * ballArr.length);
		// int tmp = 0;
		// tmp = ballArr[i];
		// ballArr[i]=ballArr[j];
		// ballArr[j]=tmp;
		// }
		// // �迭 ballArr�� �տ��� 3���� ���� �迭 ball3�� �����Ѵ�.
		// for(int y=0;y<3;y++){
		// ball3[y]=ballArr[y];
		// }
		// for(int i=0;i<ball3.length;i++) {
		// System.out.print(ball3[i]);
		// }

		// ū �ݾ��� ������ �켱������ �Ž��� ����Ѵ�.
		// int[] coinUnit = {500, 100, 50, 10};
		// int money = 2680;
		// System.out.println("money="+money);
		// for(int i=0;i<coinUnit.length;i++) {
		// System.out.println(coinUnit[i]+"��: "+money/coinUnit[i]);
		// money -= money/coinUnit[i]*coinUnit[i];
		// }

		/*
		 * if(args.length!=1) {
		 * System.out.println("USAGE: java Exercise5_7 3120"); System.exit(0); }
		 * // ���ڿ��� ���ڷ� ��ȯ�Ѵ�. �Է��� ���� ���ڰ� �ƴ� ��� ���ܰ� �߻��Ѵ�. int money =
		 * Integer.parseInt(args[0]); System.out.println("money="+money); int[]
		 * coinUnit = {500, 100, 50, 10 }; // ������ ���� int[] coin = {5, 5, 5, 5};
		 * // ������ ������ ���� for(int i=0;i<coinUnit.length;i++) { int coinNum = 0;
		 * // (1) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�. //1. �ݾ�(money)�� ���������� ������ �ʿ��� ������
		 * ����(coinNum)�� ���Ѵ�. coinNum =money/coinUnit[i]; // 2. �迭 coin����
		 * coinNum��ŭ�� ������ ����. // (���� ����� ������ ���ٸ� �迭 coin�� �ִ� ��ŭ�� ����.)
		 * if(coinNum>coin[i]){ coinNum=coin[i]; } coin[i] -= coinNum; // 3.
		 * �ݾ׿��� ������ ����(coinNum)�� ���������� ���� ���� ����. money -= coinNum*coinUnit[i];
		 * System.out.println(coinUnit[i]+"��: "+coinNum); } if(money > 0) {
		 * System.out.println("�Ž������� �����մϴ�."); System.exit(0); // ���α׷��� �����Ѵ�. }
		 * System.out.println("=���� ������ ���� ="); for(int
		 * i=0;i<coinUnit.length;i++) {
		 * System.out.println(coinUnit[i]+"��:"+coin[i]); }
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
		 * String result = ""; // ���ڿ� src�� ���ڸ� charAt()���� �ϳ��� �о ��ȯ �� result��
		 * ���� for(int i=0; i < src.length();i++) { char ch = src.charAt(i);
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
