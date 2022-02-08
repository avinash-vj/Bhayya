package ProgramTestYantra;

public class printString {

	public static void main(String[] args) {
		int count=0;
		String s="Automation Engineer";
		String reverse ="";
		System.out.println("Printing Original String : ");
		for (int i = 0; i <s.length(); i++) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.println("Printing in reverse : ");
		for (int i = s.length()-1; i >=0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println(reverse);
		
		System.out.println("Printing in reverse using thrird variable : ");
		for (int i = s.length()-1; i >=0; i--) {
			reverse=reverse+s.charAt(i);
		}
		System.out.println(reverse);
		
		System.out.println("Printing in reverese w/o length and 3rd varaible : ");
		char[] charArray = s.toCharArray();//converting string to array
		//for each loop for counting the character in the array
		for (char c : charArray) {
			count++;
		}		
		System.out.println("The length of the String "+count);
		for (int i = count-1; i >=0; i--) {
			System.out.print(charArray[i]);
		}
		
		System.out.println("String is Palindrome");
	}
}
