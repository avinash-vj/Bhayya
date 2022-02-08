package JavaPratice;

import java.util.LinkedHashSet;

public class program20 {

	public static void main(String[] args) {
		String s="Fear leads to anger anger leads to hatred hatred leads to conflict conflict leads to suffering ";
		s=s.toLowerCase();
		System.out.println(s);
		String[] str = s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for (int i = 0; i < str.length; i++) {
			set.add(str[i]);
		}
		System.out.println("Occurance of each word : ");
		for (String st : set) {
			int count=0;
			for (int i = 0; i < str.length; i++) {
				if(st.equals(str[i])) {
					count++;
				}
			}
			if(count>=1) {
				System.out.print(st+"-->"+count+" ,");
			}
		}
	}
}