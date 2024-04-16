package Inheritance_titv;

public class Cat extends Animal {
	public Cat() {
		super("cat");
	}
	public void meow() {
		System.out.println("meo meo");
	}
	@Override
	public void Eat() {
		System.out.println("an ca");
	}
	

}
