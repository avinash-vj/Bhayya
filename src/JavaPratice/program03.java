package JavaPratice;

public class program03 {

	public static void main(String[] args) {
		String s="WelcomeToJavaWorld";
		int count=0;
		for (char ch : s.toCharArray()) {
			count++;			
		}
		char[]ch=s.toCharArray();
		System.out.println(count);
		for (int i = count-1; i >=0; i--) {
			System.out.print(ch[i]);
		}
	}
}