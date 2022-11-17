package hcl;

public class JP_Palindromeforrange {
	public static void main(String[] args) {
		int c=0;
		System.out.println("Palidrome number from 1 to 10"); 
		for (int n = 1; n <=30; n++) {
			int a=n,i=0,j=0;
			while (a>0) {
				i=a%10;
				j=(j*10)+i;
				a=a/10;
			}
			if (n==j) {
				System.out.println(j);
				c++;
			}
			
		}
		System.out.println("count of Palindrome numbers="+c);
	}

}
