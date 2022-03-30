package tempProgram;

public class HidingShadowing {
	public static void main(String[] args) {
		A obj1=new A();
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		System.out.println(obj1.q);
		//System.out.println(obj1.w);
		obj1.test();
		obj1.test1();

		B obj2=new B();
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		System.out.println(obj2.q);
		System.out.println(obj2.w);
		obj2.test();
		obj2.test1();
		
		A obj3=new B();
		System.out.println(obj3.a);
		System.out.println(obj3.b);
		System.out.println(obj3.q);
		//System.out.println(obj3.w);
		obj3.test();
		obj3.test1();
	}
}