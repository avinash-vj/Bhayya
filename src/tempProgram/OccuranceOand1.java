package tempProgram;

public class OccuranceOand1 {

	public static void main(String[] args) {
		int []a= {0,1,0,0,1,0,1};
		int count0=0;
		int count1=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==0) {
				count0++;
			}
			else if (a[i]==1) {
				count1++;
			}
		}
		System.out.println(count0);
		System.out.println(count1);
	}
}