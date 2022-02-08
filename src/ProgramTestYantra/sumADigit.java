package ProgramTestYantra;

import java.util.Scanner;

public class sumADigit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number");
		int a=s.nextInt();
		int temp=a;
		int count=0;
		while(temp>0) {
			int ld=temp%10;			
			count=count+ld;
			temp=temp/10;
		}
		System.out.println(count);
	}

}
