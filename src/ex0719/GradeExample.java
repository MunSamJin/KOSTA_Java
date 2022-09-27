package ex0719;

/**
날짜 : 07월19일
주제 : 성적 구하기
*/


//성적표기능을 만들 클래스를 선언하고 메인메소드 작성한다.
public class GradeExample {
	public static void main(String[] args) {
		
		
		// 이름(String)을 저장할 변수를 선언한다.
        // 국어(int),영어(int),수학(int) 점수를 저장할 변수를 선언한다.
        // 총점(int), 평균(double), 학점(char)을 저장할 변수를 선언한다.
		String name = "홍길동";
		int korean;
		int english;
		int math;
		int sum;
		double average;
		char grade;


		// 선언된 국어, 영어, 수학 변수에 난수 45 ~ 100 사이를 발생해서 각각 저장한다.
		korean = (int)(Math.random()*56) +45;
		english = (int)(Math.random()*56) +45;
		math = (int)(Math.random()*56) +45;

		// 국어, 영어, 수학 총점을 구하여 총점 변수에 저장한다.
		// 총점을 가지고 평균을 구하여 평균 변수에 저장한다.
		sum = (int)(korean + english + math);
		average = (double)sum/3;
		average = (int)(average*100) / 100.0;


		// 평균이 90이상면 A, 80 ~ 89 사이면 B , 70~79 사이면 C , 60 ~ 69 사이면 D 나머지는 F
		if(average>=90.0) {
			grade = 'A';
		} else if(average>=80.0) { 
			grade = 'B';
		} else if(average>=70.0) { 
			grade = 'C';
		} else if(average>=60.0) { 
			grade = 'D';
		} else {
			grade = 'F';
		}


		// 이름 , 국어점수, 영어점수, 수학점수, 총점,평균, 학점을 예쁘게 출력해본다.
		System.out.println("이름: " + name);
		System.out.println("국어점수 : " + korean);
		System.out.println("영어점수 : " + english);
		System.out.println("수학점수 : " + math);
		System.out.println("총점: " + sum);
		System.out.println("평균: " + average);
		System.out.println("학점: " + grade);

	}
}