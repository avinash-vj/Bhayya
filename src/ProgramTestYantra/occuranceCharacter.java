package ProgramTestYantra;

import java.util.HashSet;

public class occuranceCharacter {

	public static void main(String[] args) {
		//String Value
		String s="Character";
		s=s.toLowerCase();
		//Crating the HashSet (no duplicate allowed)
		HashSet<Character> set = new HashSet<Character>();
		//Adding the String value to HashSet
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		System.out.println(set);
		for (Character ch : set) {
			int count=0;
			for (int j = 0; j < s.length(); j++) {
				if(ch==s.charAt(j)) {
					count++;
				}
			}
			System.out.println(ch+" occured "+count);
		}
	}
}