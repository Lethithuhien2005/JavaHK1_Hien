package Inheritance_titv;

public class BabyDog extends Dog {
	public BabyDog() {
		super();
	}
	public void weep() {
		System.out.println("ang ang");
	}
	@Override
	public void Eat() {
		System.out.println("an chao");
	}
}
