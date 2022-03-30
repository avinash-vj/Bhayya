package ProgramTestYantra;

public class sortArrayDescending {

	public static void main(String[] args) {
		int []a= {4,2,1,6,8,1,6,8};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}				
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ,");
		}
	}
}