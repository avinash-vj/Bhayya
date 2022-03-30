package tempProgram;

public class RevereseEachWord {
	public static void main(String[] args) {
		String s="My name is Avinash";
		String[] str = s.split(" ");
		System.out.println("Printing the array normal order : ");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]+" ");
		}
		System.out.println();		
		System.out.println("Reversing the string in reverese odere :");
		//System.out.println(str[0]);
		for (int i = 0; i < str.length; i++) {
			String temp=str[i];
			System.out.print(" ");
			for (int j = temp.length()-1; j >=0; j--) {
				System.out.print(temp.charAt(j));
			}			
		}
	}
}