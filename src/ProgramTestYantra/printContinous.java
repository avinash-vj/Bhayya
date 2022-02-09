package ProgramTestYantra;

public class printContinous {

	public static void main(String args[]) {
		printName(10);
		System.out.println("Avinash");
	}

	public static void printName(int n) {

		if (--n > 0) {
			//System.out.println(n);
			System.out.println("Avinash");
			printName(n);
		}
	}
}