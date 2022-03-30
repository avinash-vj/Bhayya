package JavaPratice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class program27 {

	public static void main(String[] args) {
		String s="avinash";
		s=s.toLowerCase();
		LinkedHashSet<Character>set=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Character ch : set) {
			for (int i = 0; i < s.length(); i++) {
				if(ch==s.charAt(i)) {
					System.out.println(ch+"-->position -->"+(i+1));
				}
			}
		}
	}
}