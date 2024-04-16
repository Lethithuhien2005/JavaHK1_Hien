package OOP;

public class MaytinhCasioFX500 implements MTbotui{

	@Override
	public double Tong(double a, double b) {
		return a+b;
	}

	@Override
	public double hieu(double a, double b) {
		return a-b;
	}

	@Override
	public double Tich(double a, double b) {
		return a*b;
	}

	@Override
	public double Thuong(double a, double b) {
		return a/b;
	}

}
