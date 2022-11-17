package hcl;

public class Amstrong_Number {
	public static void main(String[] args) {
		int n = 153;
		int a=n,i=0,j=0;
		while (a>0) {
			i=a%10;
			j=(i*i*i)+j;
			a=a/10;
		}
		if (n==j) {
			System.out.println("Amstrong");
		}
		else {
			System.out.println("Not Amstrong");
			
		}
	}

}
