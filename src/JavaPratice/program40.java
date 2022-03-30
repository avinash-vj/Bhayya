package JavaPratice;

public class program40 {

	public static void main(String[] args) {
		int []str= {5,4,2,0,23,25};
		for (int i = 0; i < str.length; i++) {
			int n=str[i];
			if(n==1) {
				System.out.println("Prime no : "+n);
			}
			else if(n==0) {
				System.err.println(n+" not a valid integer");
			}
			else {
				int a=2;
				while(n>=a) {
					if(n%a==0) {
						break;
					}
					a++;
				}
				if(a==n) {
					System.out.println("Prime no : "+n);
				}
				else {
					//System.err.println("Not Prime no : "+n);
				}
				a=2;
			}
		}
	}
}