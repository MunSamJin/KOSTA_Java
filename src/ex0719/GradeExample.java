package ex0719;

/**
��¥ : 07��19��
���� : ���� ���ϱ�
*/


//����ǥ����� ���� Ŭ������ �����ϰ� ���θ޼ҵ� �ۼ��Ѵ�.
public class GradeExample {
	public static void main(String[] args) {
		
		
		// �̸�(String)�� ������ ������ �����Ѵ�.
        // ����(int),����(int),����(int) ������ ������ ������ �����Ѵ�.
        // ����(int), ���(double), ����(char)�� ������ ������ �����Ѵ�.
		String name = "ȫ�浿";
		int korean;
		int english;
		int math;
		int sum;
		double average;
		char grade;


		// ����� ����, ����, ���� ������ ���� 45 ~ 100 ���̸� �߻��ؼ� ���� �����Ѵ�.
		korean = (int)(Math.random()*56) +45;
		english = (int)(Math.random()*56) +45;
		math = (int)(Math.random()*56) +45;

		// ����, ����, ���� ������ ���Ͽ� ���� ������ �����Ѵ�.
		// ������ ������ ����� ���Ͽ� ��� ������ �����Ѵ�.
		sum = (int)(korean + english + math);
		average = (double)sum/3;
		average = (int)(average*100) / 100.0;


		// ����� 90�̻�� A, 80 ~ 89 ���̸� B , 70~79 ���̸� C , 60 ~ 69 ���̸� D �������� F
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


		// �̸� , ��������, ��������, ��������, ����,���, ������ ���ڰ� ����غ���.
		System.out.println("�̸�: " + name);
		System.out.println("�������� : " + korean);
		System.out.println("�������� : " + english);
		System.out.println("�������� : " + math);
		System.out.println("����: " + sum);
		System.out.println("���: " + average);
		System.out.println("����: " + grade);

	}
}