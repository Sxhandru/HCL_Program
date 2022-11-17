package hcl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListDuplication {
	public static void main(String[] args) {
		List<String> C = new ArrayList<String>();
		C.add("a");
		C.add("b");
		C.add("c");
		C.add("d");
		C.add("b");
		C.add("c");
		C.add("a");
		C.add("a");
		C.add("a");
		System.out.println("Count all with Frequency");
		Set<String> Unqiuevalue = new HashSet<String>(C);
		for (String emp : Unqiuevalue) {
			System.out.println(emp + ": "+ Collections.frequency(C, emp));
			
		}
	}

}
