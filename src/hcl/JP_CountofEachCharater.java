package hcl;

import java.util.LinkedHashMap;
import java.util.Map;

public class JP_CountofEachCharater {
	public static void main(String[] args) {
		String S ="Welcome to java class java course to java";
		Map<String, Integer> C = new LinkedHashMap<String,Integer>();
		String[] allwords = S.split(" ");
		for (String words: allwords) {
			if (C.containsKey(words)) {
				Integer value = C.get(words);
				C.put(words, value+1);
			}
			else {
				C.put(words, 1);
			}
		}
		System.out.println("Count of each word in String");
		System.out.println(C);
	}

}
