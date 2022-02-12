package ProgramTestYantra;

public class arrayAddition {

	public static void main(String[] args) {
		int []a= {1,2,3,4};
		int []b= {6,7,8,9,10};
		int count=a.length;
		if(count<b.length) {
			count=b.length;
		}
		for (int i = 0; i < count; i++) {
			try {
				System.out.println(a[i]+b[i]);
			}
			catch (Exception e) {
				if(a.length>b.length) {
					System.out.println(a[i]);
				}
				else {
					System.out.println(b[i]);
				}
			}
		}

	}

}
