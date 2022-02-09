package ProgramTestYantra;

public class primeNumberCheck {

	public static void main(String[] args) {
		int n=5;
		int i=2;

		while(i<=n) {
			if(n%i==0) {
				break;
			}
			i++;
		}
		
		if(n==i) {
			System.out.println("its prime numnber");
		}
		else {
			System.out.println("not a prime number");
		}
		/*

		System.out.println("logic two");
		int count=0;
		for (int j = 1; j <=n; j++) {
			if(n%j==0) {
				count++;
			}
		}

		if(count<=2) {
			System.out.println("its not prime numnber");
		}
		else {
			System.out.println("its a prime number");
		}
		 */
	}

}
