package ProgramTestYantra;

public class arrayPrimeNumber {

	public static void main(String[] args) {
		int []a=new int[10];
		int k=1;
		int div=1;
		for (int i = 0; i < a.length; i++) {
			if(k%div==0) {
				a[i]=k;
				System.out.println(a[i]);
				break;}
				else {
					
				}
			}
			/*
			while(k<=div) {
				if(k%div==0) {
				a[i]=k;
				System.out.println(a[i]);
				k++;
				break;
				}
				else {
					//k++;
				div++;				
			}
			*/
		

}
}
