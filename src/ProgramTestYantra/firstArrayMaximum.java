package ProgramTestYantra;

public class firstArrayMaximum {

	public static void main(String[] args) {
		int []a= {5,25,2,6,4,3,71,51};
		int temp=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>temp) {
				temp=a[i];
			}
			for (int j = i+1; j < a.length; j++) {
				if(temp<a[j]) {
					temp=a[j];
				}
			}
		}
		System.out.println(temp);

	}
}

/*
for (int i = 0; i < a.length; i++) {
for (int j = i+1; j < a.length; j++) {
	if(a[i]>a[j]) {
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}				
}
}
for (int i = 0; i < a.length; i++) {
System.out.print(a[i]+" ,");
}
System.out.println("1st min :"+a[0]);
for (int j = 0; j < a.length; j++) {
if(a[0]<a[j]) {
	System.out.println("2nd min :"+a[j]);
	break;
}
}
 */