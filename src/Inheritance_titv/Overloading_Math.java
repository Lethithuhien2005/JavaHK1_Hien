package Inheritance_titv;

public class Overloading_Math {
	public int timMin(int a, int b) {
		if (a < b) {
			return a;
		} else {
			return b;
		}
	}
	public double timMin(double a, double b) {
		if (a>b) {
			return b;
		} else {
			return a;
		}
	}
	public int tinhTong(int a, int b) {
		return a+b;
	}
	public double tinhTong(double[] arr) {
		double sum = 0;
		for (int i = 0; i<arr.length;i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
}
