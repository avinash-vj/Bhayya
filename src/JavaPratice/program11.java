package JavaPratice;

public class program11 {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		for (int i = 0; i < 25; i++) {
			int c=a+b;
			if(c>=25) {
				break;
			}
			System.out.print(c+" ,");
			
			a=b;
			b=c;
			
		}

	}

}
