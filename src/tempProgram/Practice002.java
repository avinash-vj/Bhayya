package tempProgram;

import java.util.LinkedHashSet;

public class Practice002 {
	public static void main(String[] args) {
		String s="my name lokesh & lokesh my name sky blue";
		String []str=s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for (int i = 0; i < str.length; i++) {
			set.add(str[i]);
		}
		System.out.println(set);
		
		for (String word : set) {
			int count=0;
			for (int j = 0; j < str.length; j++) {
				if(word.equals(str[j])) {
					count++;
				}
			}
			System.out.println(word+" ---> "+count);
		}
	}

}