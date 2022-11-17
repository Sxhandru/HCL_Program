package hcl;

public class AscendingOrder {
	public static void main(String[] args) {
		int temp=0;
		int n[]= {20,30,40,50,60,70,80,90,10,100,120,20,30,40};
		System.out.println("AScending Order");
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i]+" ");
		}
		for (int j = 0; j < n.length; j++) {
			for (int k = 1+j; k < n.length; k++) {
				while (n[j]>n[k]) {
					temp=n[j];
					n[j]=n[k];
					n[k]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Ascending Order");
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i]+" ");
	}

}
}