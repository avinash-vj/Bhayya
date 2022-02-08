package ProgramTestYantra;

public class numbersSwap {

	public static void main(String[] args) {
		int a=10;
		int b=30;
		
		System.out.println("Without third varaible swaping");
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);

	}

}
