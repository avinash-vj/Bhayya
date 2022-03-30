package JavaPratice;

public class program58 {

	public static void main(String[] args) {
		String s="Hello java programing world";
		int count=0;
		String[]arr=s.split(" ");
		for (String string : arr) {
			count++;
		}
		System.out.println(count);  //4

		String s1="TestYantra";
		//String s2="UestYantra";
		//int Ascii=s1.compareTo(s2); //check the difference between the string
		//System.out.println(Ascii);    //-1
		int i=0;

		while(true) {
			try{
				s1.charAt(i);
				i++;
			}
			catch (Exception e) {
				System.out.println(i); //10
				break;
			}
		}
	}
}