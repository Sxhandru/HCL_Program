package hcl;

public class ReverseString {
	public static void main(String[] args) {
		String S ="nishathi";
		String S1 ="";
		for (int i = S.length()-1; i >=0; i--) {
			S1=S1+S.charAt(i);
		}
		System.out.println(S1);
	}

}
