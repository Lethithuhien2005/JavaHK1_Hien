package Inheritance_titv;

public class testADBCB {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.Eat();
		d1.Bark();
		System.out.println("----------------");
		BabyDog b1 = new BabyDog();
		b1.Eat();
		b1.weep();
		System.out.println("----------------");
		Cat c1 = new Cat();
		c1.Eat();
		c1.meow();
		System.out.println("----------------");
		Bird bird1 = new Bird();
		bird1.Eat();
		bird1.fly();

	}
}
