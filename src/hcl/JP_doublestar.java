package hcl;

public class JP_doublestar {
	public static void main(String[] args) {
		for (int i = 1; i <=10; i++) {
			for (int j = 1; j <=i; j++) {
				if (i%2==0) {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
		
		
	}

}
