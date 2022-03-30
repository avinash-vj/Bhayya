package tempProgram;

public class Dog extends Animal{
	public static void main(String[] args) {
		Dog dg=new Dog();
		dg.eat();
		System.out.println(dg.a);
		System.out.println("---------------");
		Dog dg1=new Dog();
		System.out.println(dg1.a);
	}
}