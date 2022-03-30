package tempProgram;

public class NUmber3and7Divisible {

	public static void main(String[] args) {
		int a=10;
		int b=210;
		for (int i = a; i <= b; i++) {
			if (i%3==0 && i%7==0) {
				System.out.println(i);
			}
		}
	}
}