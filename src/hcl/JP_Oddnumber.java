package hcl;

public class JP_Oddnumber {
	public static void main(String[] args) {
		int Sum =0, C=0;
		for (int i = 0; i <30; i++) {
			if (i%2==1) {
				System.out.print(i+" ,");
				Sum=Sum+i;
				C++;
			}
		}
		System.out.println();
		System.out.println("Sum of Odd number from 0 to 30 = "+Sum);
		System.out.println("Count of odd number from 0 to 30 = "+C);
	}

}
