package JavaPratice;

public class program39 {

	public static void main(String[] args) {
		int n=56998;	
		System.out.println("the iteration for the provided number "+n+" are :  ");
		sum(n);
	}	
	public static void sum(int n) {
		int add=0;
		int ld=0;
		int temp=n;
		for (int i = 0; i<=temp; i++) {
			ld=temp%10;
			add=add+ld;
			temp=temp/10;
			i=0;
		}
		System.out.println(n+"-----> "+add);
		if(add>9) {
			sum(add);
		}
	}
}