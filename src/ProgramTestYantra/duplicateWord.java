package ProgramTestYantra;

import java.util.LinkedHashSet;

public class duplicateWord {

	public static void main(String[] args) {
		String s="the sky is blue and water is blue and cloud is clear";
		String[] str = s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
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
			if(count>=2) {
			//System.out.println(word+" -duplicate-> "+count);
			System.out.print(word+" ");
		}
	}

}

}
