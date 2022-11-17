package hcl;

public class Charcount {
	public static void main(String[] args) {
		int Lowercase=0,Uppercase=0,Numerical=0,Special=0;
		String S ="Hi Welcome To Java Classes Tommorow At 2.00p.m!!";
		for (int i = 0; i < S.length(); i++) {
		if (S.charAt(i)>='a' && S.charAt(i)<='z') {
			Lowercase++;
		}
		else if (S.charAt(i)>='A' && S.charAt(i)<='Z') {
			Uppercase++;
		}
		else if (S.charAt(i)>='0' && S.charAt(i)<='9') {
			Numerical++;
		}
		else {
			Special++;
		}
	}
		System.out.println("Total Numeric of Lowercase : "+Lowercase);
		System.out.println("Total Numeric of Uppercase : "+Uppercase);
		System.out.println("Total Numeric of Numerical : "+Numerical);
		System.out.println("Total Numeric Of Special   : "+Special);

}
}