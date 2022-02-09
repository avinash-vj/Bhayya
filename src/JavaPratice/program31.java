package JavaPratice;

public class program31 {

	public static void main(String[] args) {
		int []str= {24,56,4,2,3,9,7,5,56,44};
		System.out.println("printing in Descending order");
		for (int i = 0; i < str.length; i++) {
			for (int j = i+1; j < str.length; j++) {
				int temp=str[i];
				if(str[i]<str[j]) {
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]+", ");			
		}
		System.out.println();
		System.out.println("1st maximum number : "+str[0]);
	}
}
