package hcl;

public class SumOfDigits {
	public static void main(String[] args) {
		int n = 123;
		int a=n,i=0,j=0;
		while (a>0) {
			i=a%10;
			j=i+j;
			a=a/10;
		}
			System.out.println(j);
			
		}
	}

