package OOP;

public class ComputerManagement {
	private HangSX hang;
	private NgaySX ngay;
	private double giaban;
	private int TGbaohanh;

	public ComputerManagement(HangSX hang, NgaySX ngay, double giaban, int tGbaohanh) {
		this.hang = hang;
		this.ngay = ngay;
		this.giaban = giaban;
		TGbaohanh = tGbaohanh;
	}

	public HangSX getHang() {
		return hang;
	}

	public void setHang(HangSX hang) {
		this.hang = hang;
	}

	public NgaySX getNgay() {
		return ngay;
	}

	public void setNgay(NgaySX ngay) {
		this.ngay = ngay;
	}

	public double getGiaban() {
		return giaban;
	}

	public void setGiaban(double giaban) {
		this.giaban = giaban;
	}

	public int getTGbaohanh() {
		return TGbaohanh;
	}

	public void setTGbaohanh(int tGbaohanh) {
		TGbaohanh = tGbaohanh;
	}

	public boolean KTgia(ComputerManagement maykhac) {
		return this.giaban < maykhac.giaban;
	}
}
