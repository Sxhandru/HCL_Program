package hcl;

public class JP_StarEvennumber {
	public static void main(String[] args) {
		for (int i = 1; i <=7; i++) {
			for (int j = 1; j <=i; j++) {
				if (i%2==0) {
					System.out.print("*");
				}
			}
			System.out.println();
			
			
		}
	}

}
