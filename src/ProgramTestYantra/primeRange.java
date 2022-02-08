package ProgramTestYantra;

public class primeRange {

	public static void main(String[] args) {
		//Scanner s=new Scanner(System.in);
		//System.out.println("Enter the starting A and B number");
		int a=10;
		int b=200;
		int q=2;
		while(a<=b) {
			if(a%q==0) {
				break;
			}
			a++;
		}
			if(a==q){
				System.out.println("its prime numnber");
			}
			else {
				System.out.println("not a prime number");
			}
			q++;
			
		}
		

	}
