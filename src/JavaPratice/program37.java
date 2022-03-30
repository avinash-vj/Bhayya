package JavaPratice;

import java.util.LinkedHashSet;

public class program37 {

	public static void main(String[] args) {
		String s="tester";
		s=s.toLowerCase();
		LinkedHashSet<Character>set=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Character ch : set) {
			for (int i = 0; i < s.length(); i++) {
				if(ch==s.charAt(i)) {
					System.out.println(ch+"-->position -->"+(i+1));
					break;
				}
			}
		}
	}

}
