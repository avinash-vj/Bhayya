package JavaPratice;

public class program07 {

	public static void main(String[] args) {
		int a=0;
		int b=55;
		System.out.println("prime number range : "+a+" to "+b);
		for (int i = a; i <=b; i++) {
			if(primeCheck(i)) {
				System.out.print(i+",");
			}
		}
	}
	public static boolean primeCheck(int n) {
		if (n < 1) {
			return false;
		}			
		for (int i = 2; i < n; i++)	{
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
