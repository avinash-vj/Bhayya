package ProgramTestYantra;

import java.util.Iterator;

public class practice {

	public static void main(String[] args) {
		String s="madam";
		String sent="Java is a Programing Language";
		int count=s.length();
		for (int i = count-1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		String[] sentance = sent.split(" ");
		int count1=sentance.length;
		for (int i = count1-1; i >= 0; i--) {
			System.out.print(sentance[i]+" ");
		}
		System.out.println();
		String rev="";
		for (int i = 0; i <=s.length()-1; i++) {
			rev=s.charAt(i)+rev;
		}
		System.out.print(rev);
		System.out.println();
		char[] chArry = s.toCharArray();
		int count2 = 0;
		for (char c : chArry) {
			count2++;
		}
		for (int i = count2-1; i >=0 ; i--) {
			System.out.print(chArry[i]);
		}
		System.out.println();
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("Its palindrome");
		}
		else {
			System.out.println("Its not palindrome");
		}
		

	}

}
