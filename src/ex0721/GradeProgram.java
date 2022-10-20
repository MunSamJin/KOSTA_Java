package ex0721;


import java.util.Scanner;

class Score{

	/** 1) 국어, 영어, 수학 점수를 인수로 받아 총점을 구하여 총점을 리턴하는 메소드 작성 (접근제한자 private) */
	private int getTotal(int kor, int eng, int math){
		return kor + eng + math;
	}
	
	/** 2) 총점과 과목수(int)를 인수로 받아 평균을 구하여 평균을 리턴하는 메소드 작성 (접근제한자 private) */
	private double getAvg(int total, int diceCount) {
		double avg=total / (double)diceCount;
		return avg;
	}

	/** 3) 평균을 인수로 받아 등급을 구하여 등급을 리턴해주는 메소드 작성 (접근제한자 private)*/
	private char getGrade(double avg) {
		char grade ='F';
		
		if(avg>=90) grade = 'A';
		else if(avg>=80) grade= 'B';
		else if(avg>=70) grade= 'C';
		else if(avg>=60)grade ='D';
		
		return grade;
	}

	/** 
	 * 4) 이름, 국어, 영어, 수학 점수를 인수로 받아 총점 , 평균 ,등급 을 구하여 그 결과를 화면에 출력하는 메소드를 선언
	 * 	  (접근제한자 public,)
	 * 	  총점과 평균 , 등급은 이미 만들어진 1) , 2) ,3) 메소드를 호출하여 그 결과를 통해 얻어온다.
	 */
	public void print(String name, int kor, int eng, int math) {
	
		// 총점
		int total =this.getTotal(kor, eng, math);

		// 평균
		double avg =this.getAvg(total, 3);

		// 등급
		char grade = this.getGrade(avg);

		// 출력
		System.out.println("***" + name + "님 성적표 ***");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);

		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("등급 : " + grade);
		System.out.println("****************************");
	}

}






/**메인 메소드를 가지고 있는 클래스는 따로 만든다.
   - 메인메소드안에서 메뉴를 출력하고, 
     메뉴 선택(1. 성적표구하기     2. 종료 )에 따라 성적표를 구하거나 종료를한다.
     
   - 1번 메뉴를 선택하면 이름, 국어,영어,수학 점수를 키보드로 입력받는다.
   - 2번 메뉴를 선택하면 프로그램을 종료한다. - System.exit(0); //프로그램을 강제 종료!!
 */
class GradeProgram {

	public static void main(String[] args) { 

		Score score = new Score();

		Scanner sc = new Scanner(System.in);

		System.out.println("1. 성적표구하기     2. 종료");
        
		int result = sc.nextInt();
		
		if(result==1){
			//System.out.println("1");
			sc.nextLine();
			System.out.print("이름은 : ");
			String name = sc.nextLine();

			System.out.print("국어점수는 : ");
			int kor = Integer.parseInt(sc.nextLine());

			System.out.print("영어점수는 : ");
			int eng = Integer.parseInt(sc.nextLine());

			System.out.print("수학점수는 : ");
			int mat = Integer.parseInt(sc.nextLine());

			score.print(name,kor,eng,mat);
			
		}
		else {
			System.exit(0);
		}
	}
}
	

		

			
