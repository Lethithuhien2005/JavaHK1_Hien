package Inheritance_titv;

public class Student extends Person {
	private String tenLop;
	private String tenTruong;
	public Student(String hoten, int namsinh, String tenLop, String tenTruong) {
		super(hoten, namsinh);
		this.tenLop = tenLop;
		this.tenTruong = tenTruong;
	}
	public String getTenLop() {
		return tenLop;
	}
	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	public String getTenTruong() {
		return tenTruong;
	}
	public void setTenTruong(String tenTruong) {
		this.tenTruong = tenTruong;
	}
	public void lamBT() {
		System.out.println("java");
	}

}
