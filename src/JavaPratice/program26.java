package JavaPratice;

public class program26 {

	public static void main(String[] args) {
		String s="sds5%7^9823";
		int sum=0;
		System.out.println("the digits in the provided string are : ");
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				System.out.print(s.charAt(i)+" ,");
				//converting the value from ASCII to normal digit
				sum=sum+s.charAt(i)-48;
			}
		}
		System.out.println();
		System.out.println("the total sum of the digits in the provided string is :"+sum);
	}
}