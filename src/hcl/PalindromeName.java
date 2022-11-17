package hcl;

public class PalindromeName {
	public static void main(String[] args) {
		String S ="madam";
		String S1 ="";
		for (int i = S.length()-1; i>=0; i--) {
		S1=S1+S.charAt(i);	
		}
		System.out.println(S1);
		if (S.equals(S1)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
	}

}
