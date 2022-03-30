package tempProgram;

public class MissingNumberArray {

	public static void main(String[] args) {
		
		int []a= {1,2,6,9}; //3,4,5,7,8
		int temp=a[0];
		int last=a[a.length-1];
		System.out.println(last);
		int temp1=a[1];
		
		for (int i = 0; i < a.length; i++) {
			int diff=temp1-temp;
			if(diff==1) {
				
			}
			else {
				temp=temp1;
				temp1=a[i];
			}
			System.out.println(diff);
		}
		
	}
}