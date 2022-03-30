package JavaPratice;

public class program48 {

	public static void main(String[] args) {
		int num=5;
		int a=1;
		for (int i = 0; i < num; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(j+",");
				a++;
			}
			System.out.println();
			num=1;
		}
	}
}