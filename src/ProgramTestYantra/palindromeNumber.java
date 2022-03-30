package ProgramTestYantra;

public class palindromeNumber {

	public static void main(String[] args) {
		int n=1254634521;
		int temp=n;
		int ld=0;
		int rev=0;
		while (temp>0) {
			ld=temp%10;//gives the last digit
			rev=rev*10+ld;
			temp=temp/10;
		}
		if(n==rev) {
		System.out.println("Its palindrome");
		}
		else {
			System.out.println("its not palindrome");
		}

	}

}
