package tempProgram;

public class CountStringNoInBuilt {

	public static void main(String[] args) {
		String s="Hello java programing world";
		int count=0;
		String[]arr=s.split(" ");
		for (String string : arr) {
			count++;
		}
		System.out.println(count);

		String s1="TestYantra";
		String s2="SestYantra";
		int coun1=s1.compareTo(s2); //check the length of the string
		System.out.println(coun1);  
		int i=0;

		while(true) {
			try{
				s1.charAt(i);
				i++;
			}
			catch (Exception e) {
				System.out.println(i);
				break;
			}
		}
	}
}