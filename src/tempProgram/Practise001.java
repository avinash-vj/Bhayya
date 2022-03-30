package tempProgram;

import java.util.LinkedHashSet;

public class Practise001 {
	public static void main(String[] args) {
		char []s= {'a','b','c','d','a','b','c','d','a','b','c','d'};
		LinkedHashSet<Character>set=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length; i++) {
			set.add(s[i]);			
		}
		System.out.println(set);
		String res="";
		char q='a';
		for (Character ch : set) {
			for (int i = 0; i < s.length; i++) {
				if(ch<=q) {
					res=res+s[i];
				}			
			}
			q++;
		}
		System.out.println(res);
	}
}