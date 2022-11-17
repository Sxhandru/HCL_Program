package hcl;

public class Test {
	public static void main(String[] args) {
		String S ="Welcome To JAVA Clas @ 12345";
		int Uppercase=0,Lowercase=0,Numerical=0,Special=0;
		for (int n = 1; n < S.length(); n++) {
			char ch = S.charAt(n);
			if (S.charAt(n)>='A' && S.charAt(n)<='Z') {
				Uppercase++;
			}
			else if (S.charAt(n)>='a' && S.charAt(n)<='z') {
				Lowercase++;
			}
			else if (S.charAt(n)>='0' && S.charAt(n)<='9') {
				Numerical++;
			}
			else {
				Special++;
			}
		}
		System.out.println("Total Number of Uppercase :"+Uppercase);
		System.out.println("Total Number of Lowercase :"+Lowercase );
		System.out.println("Total Number of Numerical :"+Numerical);
		System.out.println("Total Number of Special   :"+Special);
		
		
		
		
		
		String C ="Welcome To JAVA Clas @ 12345";
		int lowercases=0,Uppercases=0,Numericalcase=0,Specialcase=0;
		for (int i = 1; i < C.length(); i++) {
			char c = C.charAt(i);
			if (Character.isLowerCase(c)) {
			lowercases++;
			}else if (Character.isUpperCase(c)) {
			Uppercases++;	
			}else if (Character.isDigit(c)) {
			Numericalcase++;
			}else {
				Specialcase++;
			}
		}
		System.out.println();
		System.out.println("Chandru");
		System.out.println("Total Number of Uppercase :"+Uppercases);
		System.out.println("Total Number of Lowercase :"+lowercases );
		System.out.println("Total Number of Numerical :"+Numericalcase);
		System.out.println("Total Number of Special   :"+Specialcase);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
