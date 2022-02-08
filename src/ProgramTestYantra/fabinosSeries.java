package ProgramTestYantra;

public class fabinosSeries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		
		System.out.println("Printing first 5 Fib numbers :");
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i < 3; i++) {
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
		System.out.println("Excluding default nos; Printing Fib numbers under 100 :");
		for (int i = 0; i < 100; i++) {
			int c=a+b;
			if(c<100) {
			System.out.println(c);
			a=b;
			b=c;
			}
		}

	}

}
