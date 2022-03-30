package JavaPratice;

public class program57 {

	public static void main(String[] args) {
		int[]a={23,42,5,3,7,26,567,654} ;
		int count=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>=10 && a[i]<=99) {
				count++;
			}
		}
		System.out.println(count);
	}
}