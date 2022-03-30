package JavaPratice;

public class program02 {

	public static void main(String[] args) {
		String s="Hello Java World";
		String reverse="";
		for (int i = 0; i < s.length(); i++) {
			reverse=s.charAt(i)+reverse;
		}
		System.out.println(reverse);
	}
}