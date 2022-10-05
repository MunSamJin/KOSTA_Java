package ex0720;

public class WhileExample {
	public static void main(String[] args) 	{
		/*
		int i=1; // ´Ü
		while(i<=8) {
			i++;
			
			int j=0; // * (1~9)
			while(j<=8) {
				j++;
				System.out.print("\t" + i + "*" + j + "=" + (i*j));
				//System.out.print(i);
				//System.out.print(j);
			}
			System.out.println();

		}
		*/
		
		int i=0; //9Çà
		while(i<=8) {
			i++;
			
			int j=1; // 8¿­
			while(j<=8) {
				j++;
				System.out.print("\t" + j + "*" + i + "=" + (j*i));
			}
			System.out.println();
		}//whileEnd
		
	}//mainEnd
}
