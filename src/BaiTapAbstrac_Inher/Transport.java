package BaiTapAbstrac_Inher;

public abstract class Transport {
	protected String tenLoaiPT;
	protected HangSX tenHang;

	
	public Transport(String tenLoaiPT, HangSX tenHang) {
		this.tenLoaiPT = tenLoaiPT;
		this.tenHang = tenHang;
	}

	public String getTenLoaiPT() {
		return tenLoaiPT;
	}

	public void setTenLoaiPT(String tenLoaiPT) {
		this.tenLoaiPT = tenLoaiPT;
	}
	public String tenHangsanxuat() {
		return this.tenHang.getTenHangSX();
	}
	
	public void batDau() {
		System.out.println("khoi dong:");
	}
	public void tangToc() {
		System.out.println("tang toc");
	}
	public void dungLai() {
		System.out.println("dung lai");
	}
	public abstract double layVanToc();
	
}
