package Abstraction;

public class Rectangle extends Shape {
	private double width;
	private double length;

	public Rectangle(ToaDo td, double width, double length) {
		super(td);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double tinhDientich() {
		return width*length;
	}
	
}
