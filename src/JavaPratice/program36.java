package JavaPratice;

public class program36 {

	public static void main(String[] args) {
		String []a= {"avinashw","drishya","kaohal","varsha","ashwini"};
		int maxLen=a[0].length();
		for (int i = 1; i < a.length; i++) {
			if(maxLen<a[i].length()) {
				maxLen=a[i].length();
				System.out.println(a[i]);
			}
		}
	}
}