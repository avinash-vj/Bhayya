package JavaPratice;

public class program47 {

	public static void main(String[] args) {
		String s2="avinashvJ";
		int count=0;
		for (int i = 0; i < s2.length(); i++) {
			if (s2.charAt(i)>='A' || s2.charAt(i)<='Z' ) {
				count++;
			}
		}
		System.out.println(count);
		String s4=s2.substring(count-1);  //J
		s4=s4.toLowerCase();	//j
		String s3=s2.substring(0, count-1)+"_"+s4; //avinash_j
		System.out.println(s3);
	}
}