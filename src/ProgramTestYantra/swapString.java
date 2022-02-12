package ProgramTestYantra;

public class swapString {
	public static void main(String[] args) {
		String a="Java";
		String b="Python";
		System.out.println(a.length());
		System.out.println(b.length());
		System.out.println("Before swap: "+a+"-->"+b);  
		a=a+b;
		System.out.println(a.length());
		b=a.substring(0, a.length() - b.length());
		System.out.println(b.length());
		System.out.println(a);
		
		a=a.substring(b.length());  
		System.out.println("After : "+a+"-->"+b);
		System.out.println(a.length());
		System.out.println(b.length());
	}

}