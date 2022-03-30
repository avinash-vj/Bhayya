package tempProgram;

public class firstTwoHighestNumber {

	public static void main(String[] args) {
		int []arr= {1,5,6,8,7,3};
		int a=arr[0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]<arr[j]) {
					a=arr[i];
					arr[i]=arr[j];
					arr[j]=a;
				}
			}
		}
		System.out.print(arr[0]+",");
		System.out.print(arr[1]);
	}
}