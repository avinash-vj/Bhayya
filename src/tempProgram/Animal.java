package tempProgram;

public class Animal {
	static {
		System.out.println("Static sleeping");
		int b=2;
		System.out.println(b);
	}
	int a=1;
	//static 
	void eat()
	{
		System.out.println("Eating");
	}
	
	{
		System.out.println("Non Static biting");
	}
}
