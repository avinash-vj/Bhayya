package JavaPratice;

public class program55 {
	public static void main(String[] args) {
		int[] a={44,78,92,65,11,33};
		int num=0;
		for (int i = 0; i < a.length; i++) {
			int temp=a[i];
			int ld=0;
			while(temp>0){
				ld=temp%10;				
				num=num*10+ld;
				temp=temp/10;
			}
			if(num==a[i]) {
				System.out.println(a[i]+"-->Palindrome");
			}
			else {
				System.out.println(a[i]+"-->Not a Palindrome");
			}
			num=0;
			ld=0;
		}
	}
}