package JavaPratice;

public class program01 {

	public static void main(String[] args) {
		System.out.println("Method 01");
		String newSt="helloJava";
		int count=newSt.length();
		for (int i = count-1; i >= 0; i--) {
			System.out.print(newSt.charAt(i));			
		}
		System.out.println();
		System.out.println("Method 02");
		StringBuilder s=new StringBuilder(newSt);
		s.reverse();
		System.out.println(s);

	}

}
