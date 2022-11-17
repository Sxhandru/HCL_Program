package hcl;

import java.util.HashMap;

public class CountofWord {
	public static void main(String[] args) {
		String S ="vengat ram";
		HashMap<String, Integer> C = new HashMap<String, Integer>();
		String[] allwords = S.split(" ");
		for (String words : allwords) {
			if (C.containsKey(words)) {
				Integer value = C.get(words);
				C.put(words, value+1);
			}
			else {
				C.put(words, 1);
			}
		}
		System.out.println("Total Number of Count of word");
		System.out.println(C);
	}

}
