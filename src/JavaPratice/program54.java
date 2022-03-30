package JavaPratice;

import java.util.LinkedHashSet;

public class program54 {

	public static void main(String[] args) {
		String s="i am a automation engineer";
		LinkedHashSet<Character> ch=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			ch.add(s.charAt(i));
		}
		int count=0;
		System.out.println(ch);
		for (Character character : ch) {
			for (int i = 0; i < s.length(); i++) {
				if(character==s.charAt(i)) {
					count++;
				}
			}
			System.out.print(character+"-->"+count+",");
			count=0;
		}
	}
}