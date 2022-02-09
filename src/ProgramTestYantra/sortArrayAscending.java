package ProgramTestYantra;

public class sortArrayAscending {

	public static void main(String[] args) {
		int []a= {10,5,1,6,8,1,6,8};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				int temp=a[i];
				if(a[i]>a[j]) {
					
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