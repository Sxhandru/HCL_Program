package hcl;

public class JP_Palindrome {
	public static void main(String[] args) {
		int n =12321;
		int a=n,i=0,j=0;
		while (a>0) {
			i=a%10;
			j=(j*10)+i;
			a=a/10;
		}
		if (n==j) {
			System.out.println("Given Num is Palindrome");
		}
		else {
			System.out.println("Given Num is Not Palindrome");
		}
	}

}
