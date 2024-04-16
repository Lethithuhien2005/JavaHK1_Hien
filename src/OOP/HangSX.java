package OOP;

public class HangSX {
	private String tenHang;
	private Quocgia quocGia;

	public HangSX(String tenHang, Quocgia quocGia) {
		super();
		this.tenHang = tenHang;
		this.quocGia = quocGia;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}

	public Quocgia getQuocGia() {
		return quocGia;
	}

	public void setQuocGia(Quocgia quocGia) {
		this.quocGia = quocGia;
	}
}
