package JavaPratice;

public class program41 {

	public static void main(String[] args) {
		String [] s= {"apple","banana","orange","mango"};
		for (int i = 0; i < s.length; i++) {
			String temp=s[i];
			
			int count=0;
			for (int j = 0; j < temp.length(); j++) {
				if(temp.charAt(j)=='a'||temp.charAt(j)=='e'||temp.charAt(j)=='i'||temp.charAt(j)=='o'||temp.charAt(j)=='u'){
					count++;
				}
			}
			System.out.println(s[i]+"-->"+count);
		}
	}
}