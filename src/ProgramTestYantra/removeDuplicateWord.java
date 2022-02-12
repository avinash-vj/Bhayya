package ProgramTestYantra;

import java.util.LinkedHashSet;

public class removeDuplicateWord {
public static void main(String[] args) {
	String s="the sky is blue and water is blue and cloud is clear";
	System.out.println("Original String  : "+s);
	String[] str = s.split(" ");
	LinkedHashSet<String> set=new LinkedHashSet<String>();
	for (int i = 0; i < str.length; i++) {
		set.add(str[i]);
	}
	
	
	System.out.println("the string without duplicate is :");
	for (String st : set) {
		
		System.out.print(st+" ");
	}
	
}
}
