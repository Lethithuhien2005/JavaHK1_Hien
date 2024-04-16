package OOP;

/*De bai: 
 * a) Tao ra Interface co ten la MTbotui, co cac phuong thuc mac dinh la cong, tru, nhan, chia 2 so thuc.
 * Xay dung cac lop hien thuc hoa Interface ben tren co ten la: MaytinhCasioFX500 va MaytinhVinaCal500.
 * 
 * b) Tao ra Interface co ten la SApxepInterface, co cac phuong thuc sap xep tang va sap xep giam mot mang so nguyen.
 * Xay dung cac lop thuc hien hoa Interface ben tren co ten la: SXChen va SXChon.
 * 
 * c) Xay dung lop hine thuc ca hai Interface o cau a va b co ten la PhanMemMT.
 */

public interface MTbotui {
		public double Tong(double a, double b);
		public double hieu( double a, double b);
		public double Tich(double a, double b);
		public double Thuong(double a, double b);
}
