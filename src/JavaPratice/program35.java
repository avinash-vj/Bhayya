package JavaPratice;

public class program35 {

	public static void main(String[] args) {
		int[]a= {2,4,6,3,8,7,8};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int sum=0;
		for (int i = 0; i < 3; i++) {
			sum=sum+a[i];
		}
		System.out.println("sum of first max 3 numbers is :"+sum);
	}

}
