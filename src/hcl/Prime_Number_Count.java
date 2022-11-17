package hcl;

public class Prime_Number_Count {
	public static void main(String[] args) {
		int c=0;
		for (int i = 1; i <=100; i++) {
		int count=0;
		for (int j = 2; j <=i/2; j++) {
			if (i%j==0) {
				count++;
			}
		}
		if (count==0) {
			c++;
			
		}
		}
		System.out.println("Total Number of Prime Number");
		System.out.println(c);
	}

}
