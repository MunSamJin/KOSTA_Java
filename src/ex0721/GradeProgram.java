package ex0721;


import java.util.Scanner;

class Score{

	/** 1) ����, ����, ���� ������ �μ��� �޾� ������ ���Ͽ� ������ �����ϴ� �޼ҵ� �ۼ� (���������� private) */
	private int getTotal(int kor, int eng, int math){
		return kor + eng + math;
	}
	
	/** 2) ������ �����(int)�� �μ��� �޾� ����� ���Ͽ� ����� �����ϴ� �޼ҵ� �ۼ� (���������� private) */
	private double getAvg(int total, int diceCount) {
		double avg=total / (double)diceCount;
		return avg;
	}

	/** 3) ����� �μ��� �޾� ����� ���Ͽ� ����� �������ִ� �޼ҵ� �ۼ� (���������� private)*/
	private char getGrade(double avg) {
		char grade ='F';
		
		if(avg>=90) grade = 'A';
		else if(avg>=80) grade= 'B';
		else if(avg>=70) grade= 'C';
		else if(avg>=60)grade ='D';
		
		return grade;
	}

	/** 
	 * 4) �̸�, ����, ����, ���� ������ �μ��� �޾� ���� , ��� ,��� �� ���Ͽ� �� ����� ȭ�鿡 ����ϴ� �޼ҵ带 ����
	 * 	  (���������� public,)
	 * 	  ������ ��� , ����� �̹� ������� 1) , 2) ,3) �޼ҵ带 ȣ���Ͽ� �� ����� ���� ���´�.
	 */
	public void print(String name, int kor, int eng, int math) {
	
		// ����
		int total =this.getTotal(kor, eng, math);

		// ���
		double avg =this.getAvg(total, 3);

		// ���
		char grade = this.getGrade(avg);

		// ���
		System.out.println("***" + name + "�� ����ǥ ***");
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + math);

		System.out.println("���� : " + total);
		System.out.println("��� : " + avg);
		System.out.println("��� : " + grade);
		System.out.println("****************************");
	}

}






/**���� �޼ҵ带 ������ �ִ� Ŭ������ ���� �����.
   - ���θ޼ҵ�ȿ��� �޴��� ����ϰ�, 
     �޴� ����(1. ����ǥ���ϱ�     2. ���� )�� ���� ����ǥ�� ���ϰų� ���Ḧ�Ѵ�.
     
   - 1�� �޴��� �����ϸ� �̸�, ����,����,���� ������ Ű����� �Է¹޴´�.
   - 2�� �޴��� �����ϸ� ���α׷��� �����Ѵ�. - System.exit(0); //���α׷��� ���� ����!!
 */
class GradeProgram {

	public static void main(String[] args) { 

		Score score = new Score();

		Scanner sc = new Scanner(System.in);

		System.out.println("1. ����ǥ���ϱ�     2. ����");
        
		int result = sc.nextInt();
		
		if(result==1){
			//System.out.println("1");
			sc.nextLine();
			System.out.print("�̸��� : ");
			String name = sc.nextLine();

			System.out.print("���������� : ");
			int kor = Integer.parseInt(sc.nextLine());

			System.out.print("���������� : ");
			int eng = Integer.parseInt(sc.nextLine());

			System.out.print("���������� : ");
			int mat = Integer.parseInt(sc.nextLine());

			score.print(name,kor,eng,mat);
			
		}
		else {
			System.exit(0);
		}
	}
}
	

		

			
