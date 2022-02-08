package ProgramTestYantra;

import java.util.HashSet;

public class occuranceWord {

	public static void main(String[] args) {
		String s="the sky is blue and water is blue";
		String[] str = s.split(" ");
		//LinkedHashSet<String> set=new LinkedHashSet<String>();
		HashSet<String> set=new HashSet<String>();
		for (int i = 0; i < str.length; i++) {
			set.add(str[i]);
		}

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