
public class HoaDonCaPhe {
	private String tenLoaiCaPhe;
	private double giaTien1kg;
	private double khoiLuong;
	
	public HoaDonCaPhe(String ten, double gia, double kl) {
		this.tenLoaiCaPhe = ten;
		this.giaTien1kg = gia;
		this.khoiLuong = kl;
	}
	public double tinhTongtien() {
		return this.giaTien1kg * this.khoiLuong;
	}
	public boolean kiemtraKLlonhon(double kl) {
//		if (this.khoiLuong> kl) {
//			return true;
//		} else {
//			return false;
//		}
		return this.khoiLuong>kl;
	}
	public boolean kiemtraTongtienlonhon500k() {
		return this.tinhTongtien()>500000;
	}
//		tính tien giam gia x%
	public double giamGiachodonlonhon500k( double x) {
		if (this.tinhTongtien()>500) {
		return (x/100)*this.tinhTongtien();
		} else {
			return 0;
		}
	}
	public double giasaukhigiam(double x) {
		return this.tinhTongtien()- this.giamGiachodonlonhon500k(x);
	}
	public static void main(String[] args) {
		HoaDonCaPhe hd1 = new HoaDonCaPhe(" trung nguyen ", 150, 2.5);
		HoaDonCaPhe hd2 = new HoaDonCaPhe(" trung nguyen ", 150, 5);
		System.out.println(" tong tien : " + hd1.tinhTongtien());
		System.out.println(" kiem ta khoi luong > 2kg " + hd1.kiemtraKLlonhon(2) );
		System.out.println(" kiem tra tong tien lon hon 500k : " + hd1.kiemtraTongtienlonhon500k());
		System.out.println(" giam gia : " + hd1.giamGiachodonlonhon500k(10));
		System.out.println(" tong tien : " + hd2.tinhTongtien());
		System.out.println(" kiem ta khoi luong > 2kg " + hd2.kiemtraKLlonhon(2) );
		System.out.println(" kiem tra tong tien lon hon 500k : " + hd2.kiemtraTongtienlonhon500k());
		System.out.println(" giam gia : " + hd2.giamGiachodonlonhon500k(10));
		System.out.println(" so tien phai tra sau khi duoc giam gia : " + hd2.giasaukhigiam(10));
	}
}
