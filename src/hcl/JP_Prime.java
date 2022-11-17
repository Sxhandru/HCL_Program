package hcl;

public class JP_Prime {
	public static void main(String[] args) {
		int c=0;
		for (int i = 1; i <=10; i++) {
			int count=0;
		for (int j = 2; j <=i/2; j++) {
			if (i%j==0) {
				count=1;
			}
		}
		if (count==0) {
			System.out.println(i);
			c++;
		}
		}
		System.out.println();
        System.out.println("count of prime number ="+c);
        

}}
