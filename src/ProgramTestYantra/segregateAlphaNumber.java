package ProgramTestYantra;

public class segregateAlphaNumber {

	public static void main(String[] args) {
		String s="Hello-World!!$1234";

		String special="";
		String num="";
		String alpha="";
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z' ||
					s.charAt(i)>='a' && s.charAt(i)<='z') {
				alpha=alpha+s.charAt(i);
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				num=num+s.charAt(i);
			}
			else {
				special=special+s.charAt(i);
			}
		}
		
		System.out.println("Special Charachet :"+special);
		System.out.println("Numbers :"+num);
		System.out.println("Alphabets :"+alpha);

	}

}
