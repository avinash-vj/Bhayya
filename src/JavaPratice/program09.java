package JavaPratice;

public class program09 {
	public static void main(String[] args) {
		int a=0;
		int b=21;
		System.out.println("not prime number range : "+a+" to "+b);
		for (int i = a; i <=b; i++) {
			if(primeCheck(i)) {
				System.out.print(i+",");
			}
		}
	}
	public static boolean primeCheck(int n) {
		if (n < 1) {
			return true;
		}			
		for (int i = 2; i < n; i++)	{
			if (n % i == 0) {
				return true;
			}
		}
		return false;
	}
}
