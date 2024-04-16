package OOP;

public class QuanlySinhvien {
	private String MaSV;
	private String Hoten;
	private NgaysinhSV ngaysinh;
	private double DTB;
	private Lop lop;

	public QuanlySinhvien(String maSV, String hoten, NgaysinhSV ngaysinh, double dTB, Lop lop) {
		MaSV = maSV;
		Hoten = hoten;
		this.ngaysinh = ngaysinh;
		DTB = dTB;
		this.lop = lop;
	}

	public String getMaSV() {
		return MaSV;
	}

	public void setMaSV(String maSV) {
		MaSV = maSV;
	}

	public String getHoten() {
		return Hoten;
	}

	public void setHoten(String hoten) {
		Hoten = hoten;
	}

	public NgaysinhSV getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(NgaysinhSV ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public double getDTB() {
		return DTB;
	}

	public void setDTB(double dTB) {
		DTB = dTB;
	}

	public Lop getLop() {
		return lop;
	}

	public void setLop(Lop lop) {
		this.lop = lop;
	}

	public boolean kiemtraDau() {
		return this.DTB >= 5;
	}
	public boolean kiemtraNgaySinh(QuanlySinhvien svkhac) {
		return this.ngaysinh.equals(svkhac.ngaysinh);
	}
}
