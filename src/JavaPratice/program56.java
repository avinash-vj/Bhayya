package JavaPratice;

public class program56 {

	public static void main(String[] args) {
		int[] a={44,78,92,65,11,33};
		int temp=a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]>temp) {
				temp=a[i];
			}
		}
		System.out.println(temp);
	}
}