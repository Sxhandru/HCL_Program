package hcl;

public class Palindrome1to99 {
	public static void main(String[] args) {
		for (int n = 0; n <=100; n++) {
			int a=n,i=0,j=0;
        while (a>0) {
        	i=a%10;
        	j=(j*10)+i;
        	a=a/10;
		}
        if (n==j) {
        	System.out.println(j);
			
		}
				
			}
			
		}
		
	}


