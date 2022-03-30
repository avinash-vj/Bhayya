package JavaPratice;

public class program15 {

	public static void main(String[] args) {
		System.out.println("100.Avinash");
		printName(100);		
	}

	public static void printName(int n) {
		if (--n > 0) {
			System.out.println((n)+".Avinash");			
			printName(n);		
		}
	}
}