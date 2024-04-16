package Inheritance_titv;

public class Person {
	private String hoten;
	private int namsinh;

	public Person(String hoten, int namsinh) {
		this.hoten = hoten;
		this.namsinh = namsinh;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public int getNamsinh() {
		return namsinh;
	}

	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}
	public void Eat() {
		System.out.println("com");
	}
	public void Drink() {
		System.out.println("nuoc");
	}
}
