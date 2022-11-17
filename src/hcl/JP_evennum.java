package hcl;

public class JP_evennum {
	public static void main(String[] args) {
		int C=0,Sum=0;
		for (int i = 0; i <30; i++) {
			if (i%2==0) {
				System.out.print(i+" ,");
				C++;
				Sum=Sum+i;
			}
		}
		System.out.println();
		System.out.println("Count of even number from 0 to 30 = "+C);
		System.out.println("Sum of even number from 0 to 30 = "+Sum);
	}

}
