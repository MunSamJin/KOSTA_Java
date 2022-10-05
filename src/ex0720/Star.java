package ex0720;

public class Star {
	public static void main(String[] args) 	{
		System.out.println("----------**실행**----------");

		for(int i=1; i<=5; i++) { 
			for(int j=1; j<=i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}

		System.out.println("******************************");

		for(int i=5; i>=0; i--) { 
			for(int j=1; j<=i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}

		System.out.println("******************************");

		for(int i=0; i<5; i++) {
			for(int j=0; j<4-i; j++) {//공백
				System.out.print("  ");				
			}

			for(int j=0; j<i+1; j++) {
				System.out.print("★");				
			}
			System.out.println();
		}
		
		System.out.println("******************************");

		for(int i=0; i<5; i++) { 
			for(int j=0; j<i; j++) {//공백			
				System.out.print("  ");			
			}				
			for(int j=0; j<5-i; j++) {//별
				System.out.print("★"); 			
			}		
			System.out.println();//개행
		}

	} //mainEnd
}
