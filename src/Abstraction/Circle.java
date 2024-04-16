package Abstraction;

public class Circle extends Shape {
	private double r;

	public Circle(ToaDo td, double r) {
		super(td);
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public double tinhDientich() {
		return r*r*Math.PI;
	}
}
