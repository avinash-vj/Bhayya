package JavaPratice;

public class program38 {

	public static void main(String[] args) {
		String s="The deep blue sky";
		s=s.toLowerCase();
		System.out.println("Original String");
		System.out.println(s);
		String[] str = s.split(" ");
		String temp="";
		temp=str[0];
		str[0]=str[str.length-1];
		str[str.length-1]=temp;
		System.out.println("After swapping");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]+" ");
		}
	}

}
