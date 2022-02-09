package ProgramTestYantra;

import java.util.LinkedHashSet;

public class postOfCharaterString {

	public static void main(String[] args) {
		String s="teSteR";
		s=s.toLowerCase();
		LinkedHashSet<Character>set=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		System.out.println(set);
		System.out.println("printing from Starting index");
		for (Character ch : set) {

			for (int i = 0; i < s.length(); i++) {
				if(ch==s.charAt(i)) {
					System.out.println(ch+"-->"+(i+1));
					break;
				}
			}
		}
		System.out.println("printing from reverse index");
		for (Character ch1 : set) {

			for (int i = s.length()-1; i >= 0; i--) {
				if(ch1==s.charAt(i)) {
					System.out.println(ch1+"-->"+(i+1));
					break;
				}
			}
		}
	}
}