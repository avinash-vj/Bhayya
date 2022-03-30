package tempProgram;

public class ReverseAll {

	public static void main(String[] args) {
		String s="hello team good morning";
		StringBuilder sb=new StringBuilder(s);
		System.out.println(sb.reverse());
		
		String[]str=s.split(" ");
		for (int i = 0; i < str.length; i++) {
			String word=str[i];
			System.out.print(" ");
			for (int j = word.length()-1; j >= 0 ; j--) {
				System.out.print(word.charAt(j));
			}
		}
	}
}