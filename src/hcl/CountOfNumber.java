package hcl;

public class CountOfNumber {
	public static void main(String[] args) {
		int n = 12345,i=0;
		while (n>0) {
			n=n/10;
			i++;
		}
		System.out.println(i);
	}

}
