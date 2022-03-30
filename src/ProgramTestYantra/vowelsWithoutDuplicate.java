package ProgramTestYantra;

import java.util.LinkedHashSet;

public class vowelsWithoutDuplicate {

	public static void main(String[] args) {
		String s="IndiansAreGood";
		s=s.toLowerCase();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for (int i = 0; i <s.length(); i++) {
			set.add(s.charAt(i));
		}
		System.out.println(set);
		LinkedHashSet<Character> set1=new LinkedHashSet<Character>();
		for (Character ch : set) {
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println(ch);
			}
			//else {
			//	System.out.print(ch);
			//}
		}
	}
}