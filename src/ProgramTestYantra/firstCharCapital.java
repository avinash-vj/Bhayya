package ProgramTestYantra;

public class firstCharCapital {

	public static void main(String[] args) {
		String s="welcome";
		System.out.println(" string Word");
		char[] a = s.toCharArray();
		for (int i = 0; i < a.length; i++) {
			a[i]=Character.toUpperCase(a[i]);
			break;
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		
		System.out.println(" String Statement");
		
		String s1="Welcome to india";
		String[] str = s1.split(" ");
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

}

/*
{
String s="welcome to india";
System.out.println(s);
char ch=(char) (s.charAt(0)-32);
System.out.print(ch);
for (int i = 1; i < s.length(); i++) {
	if(s.charAt(i)==' ') {
		System.out.print(" "+(char) (s.charAt(i+1)-32));
		i++;
	}
	else {
		System.out.print(s.charAt(i));
	}
}
}
*/