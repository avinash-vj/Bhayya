package ProgramTestYantra;

public class revereseString {
	public static void main(String[] args) {
		String s="Java is a Progrmming language !!!";
		String[] str = s.split(" ");
		System.out.println("Printing the array normal order : ");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]+" ");
		}
		System.out.println();
		
		System.out.println("Printing the string in reverese odere :");
		for (int i = str.length-1; i>=0; i--) {
			System.out.print(str[i]+" ");
		}
	}

}
