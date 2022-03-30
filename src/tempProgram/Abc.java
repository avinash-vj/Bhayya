package tempProgram;

public class Abc {
	public static void main(String[] args) {
		int n=1246654321;
		int temp=n;
		int ld=0;
		int rev=0;
		for (int i = 0; i <= temp; i++) {
			ld=temp%10;//gives the last digit
			rev=rev*10+ld;
			temp=temp/10;
			i=0;
		}
		if(n==rev) {
			System.out.println("Its palindrome");
		}
		else {
			System.out.println("its not palindrome");
		}
	}
}