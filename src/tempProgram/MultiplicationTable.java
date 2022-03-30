package tempProgram;

public class MultiplicationTable {

	public static void main(String[] args) {
		int a=1;
		int b=13;
		int temp=0;
		for (int i = a; i <= b; i++) {
			System.out.println();
			for (int j = 1; j <= 10; j++) {
				temp=i*j;
				System.out.println(i+"*"+j+"="+temp);
			}
		}
	}
}