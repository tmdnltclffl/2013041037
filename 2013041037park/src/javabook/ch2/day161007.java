package javabook.ch2;

/*//추상 클래스

abstract class MyAbstractClass{
	int num1,num2;
	int result;

	void calc(){
		result=num1+num2;
	}

	abstract int getResult();
	
}

class MyClass extends MyAbstractClass{
	int getResult(){
		return result;
	}
}*/

//6-2
/*
class SutdaCard {
	int num;
	boolean isKwang;
	
	public SutdaCard(){
		num=1;
		isKwang=true;
}
	public SutdaCard(int num ,boolean isKwang){
		this.num=num;
		this.isKwang=isKwang;
}
	public String info(){
		
		if(isKwang==true){
			return num+"K";
		}
		else{
			return num+"";
		}
	}
}*/

//6-4~5
/*class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name=name;
		this.ban=ban;
		this.no=no;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	public String info(){
		return name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();
	}
	public int getTotal() {

		return kor+eng+math;
	}
	public float getAverage() {

			return Math.round(10*(kor+eng+math)/3f)/10f;
	}
}*/

public class day161007 {

	// 인터페이스
	/*
	 * interface MyInterface{ public static final int num1= 1000; public
	 * abstract int getResult(); } class MyClass implements MyInterface{ public
	 * int getResult(){ return num1 + 300; } }
	 */

	// 오버라이딩
	/*
	 * @Override public String toString(){ return "오버라이딩 예제입니다."; } public
	 * static void main(String[] args) { // TODO Auto-generated method stub
	 * day161007 exam = new day161007(); day161007 exam2 = new day161007();
	 * 
	 * System.out.println(exam.toString());
	 * System.out.println(exam2.toString()); }
	 */

	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));
	}

	public static void main(String args[]) {

		// 6-2
		/*
		 * SutdaCard card1 = new SutdaCard(3, false); SutdaCard card2 = new
		 * SutdaCard(); System.out.println(card1.info());
		 * System.out.println(card2.info());
		 */

		// 6-4
		/*
		 * Student s = new Student(); s.name = "홍길동"; s.ban = 1; s.no = 1; s.kor
		 * = 100; s.eng = 60; s.math = 76; System.out.println("이름:"+s.name);
		 * System.out.println("총점:"+s.getTotal());
		 * System.out.println("평균:"+s.getAverage());
		 */
		// 6-5
		/*
		 * Student s = new Student("홍길동",1,1,100,60,76);
		 * System.out.println(s.info());
		 */

		System.out.println(getDistance(1, 1, 2, 2));
	}

}
