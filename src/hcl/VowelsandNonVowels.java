package hcl;

public class VowelsandNonVowels {
	public static void main(String[] args) {
		int vowels=0,nonvowels=0;
		String S="welcome";
		for (int i = 0; i <S.length(); i++) {
		  char ch = S.charAt(i);
		  if (ch=='a' || ch=='A' || ch== 'e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u'|| ch=='U') {
			  vowels++;
		}
		  else {
			nonvowels++;
		}
		}
		System.out.println("Total Number of vowels    :" +vowels);
		System.out.println("Total Number of Nonvowels :" +nonvowels);
	}

}
