package BaiTapAbstrac_Inher;

public class XeOto extends Transport {
private String loaiNhienLieu;

public XeOto(String tenLoaiPT, HangSX tenHang, String loaiNhienLieu) {
	super("Xe o to", tenHang);
	this.loaiNhienLieu = loaiNhienLieu;
}

public String getLoaiNhienLieu() {
	return loaiNhienLieu;
}

public void setLoaiNhienLieu(String loaiNhienLieu) {
	this.loaiNhienLieu = loaiNhienLieu;
}

@Override
public double layVanToc() {
	return 65;
}
}
