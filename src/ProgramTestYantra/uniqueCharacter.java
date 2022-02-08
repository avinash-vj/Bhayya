package ProgramTestYantra;

import java.util.LinkedHashSet;

public class uniqueCharacter {

	public static void main(String[] args) {

		//String Value
		String s="Character";
		s=s.toLowerCase();
		//Crating the HashSet (no duplicate allowed) insertio order maintained
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		//Adding the String value to HashSet
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		//Using for ech loop and checking each collection values
		for (Character ch : set) {
			int count=0; //intinalizing global to inner loop and local to for each loop
			//using the loop and comparing the value individually
			for (int j = 0; j < s.length(); j++) {
				if(ch==s.charAt(j)) {
					count++;
				}
			}
			if(count==1) {
				System.out.print(ch);
			}
		}

	}
}
