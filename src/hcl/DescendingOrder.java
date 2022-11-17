package hcl;

public class DescendingOrder {
	public static void main(String[] args) {
		int temp=0;
	  int n[]= {12,48,35,50,90,};
	  System.out.println("Descending Order");
	  for (int i = 0; i < n.length; i++) {
		  System.out.print(n[i]+" ");
	}
	  for (int j = 0; j < n.length; j++) {
		  for (int k = 0; k < n.length; k++) {
			  while (n[j]>n[k]) {
				  temp=n[j];
				  n[j]=n[k];
				  n[k]=temp;
			}
		}
	}
	  System.out.println();
	  System.out.println("Descending Order");
	  for (int i = 0; i < n.length; i++) {
		  System.out.print(n[i]+" ");
	}
	  
	  }

}
