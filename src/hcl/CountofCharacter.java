package hcl;

import java.util.HashMap;
import java.util.Map;

public class CountofCharacter {
	public static void main(String[] args) {
		String S ="vengatram";
		HashMap<String, Integer> C = new HashMap<String,Integer>();
		String[] allwords = S.split("");
		for (String words : allwords) {
			if (C.containsKey(words)) {
				Integer value = C.get(words);
				C.put(words, value+1);
			}
			else {
				C.put(words, 1);
			}
		}
		System.out.println("Count of each Character in String");
		System.out.println(C);
	}

}
