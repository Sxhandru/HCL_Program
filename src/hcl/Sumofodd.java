package hcl;

public class Sumofodd {
	public static void main(String[] args) {
		int Evennumber=0,Oddnumber=0;
		for (int n = 1; n <=100; n++) {
			if (n%2==0) {
				Evennumber=Evennumber+n;
			}
				else {
					Oddnumber=Oddnumber+n;
			}
		}
		System.out.println("Total Number of Evennumber : "+Evennumber);
		System.out.println("Total Number of Oddnumber  : "+Oddnumber);
	}

}
