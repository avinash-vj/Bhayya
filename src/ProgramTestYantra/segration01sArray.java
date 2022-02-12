package ProgramTestYantra;

public class segration01sArray {

	public static void main(String[] args) {
		int []a= {1,3,0,0,5,0,0,4};
		int []b=new int[a.length];
		int m=0; //starting index of the b[]
		int n=b.length-1; //ending index of the b[]
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
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}

	}

}
