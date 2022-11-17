package hcl;

public class JP_AmstrongNumber {
	public static void main(String[] args) {
		int c=0;
		System.out.println("The Amstrong Number");
		for (int n = 1; n <=1000; n++) {
			int a=n,i=0,j=0;
			while (a>0) {
				i=a%10;
				j=(i*i*i)+j;
				a=a/10;
			}
			
			if (n==j) {
				System.out.println("Amstrong Number =" +j);
				c++;
			}
		}
		System.out.println(c);
		
	}

}
