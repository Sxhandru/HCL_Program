package hcl;

public class JP_Oddnumbrtri {
	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				if (i%2==1) {
					System.out.print(i+" ");
				}
			}
			System.out.println();
			
		}
		
		int num=1;
		for (int i =1 ; i <=5; i+=2) {
			for (int j = 0; j <=i; j++) {
				System.out.print(num+" ");
				
			}
			System.out.println();
			num+=2;
		}
	}

}
