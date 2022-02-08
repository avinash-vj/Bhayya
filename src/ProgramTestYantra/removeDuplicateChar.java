package ProgramTestYantra;

import java.util.LinkedHashSet;

public class removeDuplicateChar {

	public static void main(String[] args) {
		//String Value
		String s="Madam";
		s=s.toLowerCase();
		//Crating the HashSet (no duplicate allowed) inserion mainr=tained
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		//Adding the String value to HashSet
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		//Using for each loop and checking each collection values
		for (Character ch : set) {
			System.out.print(ch);
		}
	}
}