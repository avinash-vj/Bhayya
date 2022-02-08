package JavaPratice;

import java.util.LinkedHashSet;

public class program17 {

	public static void main(String[] args) {
		String s="ActivateWindows";
		s=s.toLowerCase();
		System.out.println("Original Text : "+s);
		LinkedHashSet<Character>set=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));			
		}
		System.out.println("Priting only Duplicate charater : ");
		for (Character ch : set) {
			int count=0;
			for (int i = 0; i < s.length(); i++) {
				if(ch==s.charAt(i)) {
					count++;
				}
			}
			if(count>1) {
				System.out.print(ch+", ");
			}
		}
	}
}