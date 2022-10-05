package ex0720;

public class DoWhileExample {
	public static void main(String[] args) 	{
		
		/*
		int i=2; //´Ü
		do{
			int j=1; //(1~9)
			do{
				System.out.println("\t" + i + "*" + j + "=" + (i*j));
				//System.out.print(i);
				//System.out.print(j);
				j++;
			}while(j<=9);

			System.out.println();
			i++;

		}while(i<=9);
		*/
		
		int i=1; //9Çà
		do{
			int j=2; // 8¿­
			do{
				System.out.print("\t" + j + "*" + i + "=" + (j*i));
				j++;
			}while(j<=9);
			System.out.println();
			i++;
		}while(i<=9);
	}
}
