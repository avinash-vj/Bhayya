package JavaPratice;

import java.util.LinkedHashSet;

public class program19 {

	public static void main(String[] args) {
		String s="ActivateWindows";
		s=s.toLowerCase();
		System.out.println("Original Text : "+s);
		LinkedHashSet<Character>set=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));			
		}
		System.out.println("Removing duplicate and printing : ");
		for (Character ch : set) {
			System.out.print(ch+", ");
		}
	}
}