package Abstraction;

public class TestShape {
	public static void main(String[] args) {
		ToaDo td1 = new ToaDo(2, 3);
		ToaDo td2 = new ToaDo(4, 6);

		Shape s1 = new Circle(td1, 2);
		Shape s2 = new Rectangle(td2, 3, 5);

		System.out.println("Dien tich hinh tron: " + s1.tinhDientich());
		System.out.println("dien tich hinh CN: " + s2.tinhDientich());
	}
}
