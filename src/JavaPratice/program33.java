package JavaPratice;

public class program33 {

	public static void main(String[] args) {
		int []str= {24,5,5,6,44,6,56,44};
		System.out.println("printing in ascending order");
		for (int i = 0; i < str.length; i++) {
			for (int j = i+1; j < str.length; j++) {
				int temp=str[i];
				if(str[i]>str[j]) {
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]+", ");			
		}
		System.out.println();
		System.out.println("the second maximum number in the array is : ");
		for (int i = str.length-2; i > 0;i-- ) {
			if(str[i]<str[str.length-1])	{
				System.out.println(str[i]);
				break;
			}
		}
	}
}