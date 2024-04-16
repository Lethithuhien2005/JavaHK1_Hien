package Inheritance_titv;

public class Bird extends Animal {
	public Bird() {
		super("bird");
	}
	public void fly() {
		System.out.println("flying");
	}
	@Override
	public void Eat() {
		System.out.println("an chau chau");
	}
}
