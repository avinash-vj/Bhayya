package JavaPratice;

public class program13 {
	public static void main(String[] args) {
		int a=125023;
		int b=a;
		int c=0;
		
		for (int i = 0; b > 0; i++) {
			int ld=b%10;
			c=c+ld;
			b=b/10;
		}
		System.out.println(c);
	}
}