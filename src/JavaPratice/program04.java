package JavaPratice;

public class program04 {

	public static void main(String[] args) {
		int count=0;
		String s="Hello olleH";
		String reverse ="";
		
		for (int i = s.length()-1; i >=0; i--) {
			reverse=reverse+s.charAt(i);
		}
		System.out.println(reverse);
		
		if(s.equals(reverse)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("string is not palinfrom");
		}
	}
}