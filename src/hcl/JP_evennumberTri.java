package hcl;

public class JP_evennumberTri {
	public static void main(String[] args) {
		int num =2;
		for (int i = 1; i <=5; i+=2) {
		for (int j = 0; j <=i; j++) {
			System.out.print(num+" ");
		}	
		System.out.println();
		num+=2;
		}
		
	}

}
