package ProgramTestYantra;

public class addTwoArrays {

	public static void main(String[] args) {
		int []a= {1,3,5,4,5,8};
		int []b= {4,5,3,6,7};
		
		int count=a.length;
		if(count<b.length) {
			count=b.length;
		}		
		for (int i = 0; i < count; i++) {
			try {
			System.out.print(a[i]+b[i]+",");
			}
			catch (Exception e) {
				if(a.length>b.length) {
					System.out.print(a[i]);
				}
				else {
					System.out.print(b[i]);
				}
			}
		}
	}
}