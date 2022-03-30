package JavaPratice;

public class program43 {

	public static void main(String[] args) {
		int []a= {1,3,0,0,5,6,0,4};
		int []b=new int[a.length];
		int m=0;
		int n=b.length-1;
		for (int i = 0; i < b.length; i++) {
			if(a[i]==0) {
				b[n]=a[i];
				n--;
			}
			else {
				b[m]=a[i];
				m++;
			}
		}
		System.out.print("ArrayB :");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
	}
}