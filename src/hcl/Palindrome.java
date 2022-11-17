package hcl;

public class Palindrome {
	public static void main(String[] args) {
		int n =11;
		int a=n, i=0,j=0;
		while (a>0) {
			i=a%10;
			j=(j*10)+i;
			a=a/10;
		}
		System.out.println(j);
		if (n==j) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}}

}
