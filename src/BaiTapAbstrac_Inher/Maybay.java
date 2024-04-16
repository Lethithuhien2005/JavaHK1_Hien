package BaiTapAbstrac_Inher;

public class Maybay extends Transport{
private String loiaNhienLieu;

public Maybay(String tenLoaiPT, HangSX tenHang, String loiaNhienLieu) {
	super("May Bay", tenHang);
	this.loiaNhienLieu = loiaNhienLieu;
}

public String getLoiaNhienLieu() {
	return loiaNhienLieu;
}

public void setLoiaNhienLieu(String loiaNhienLieu) {
	this.loiaNhienLieu = loiaNhienLieu;
}

@Override
public double layVanToc() {
	return 500;
}
public void Catcanh() {
	System.out.println("7h");
}
public void Hacanh() {
	System.out.println("10h");
}
}
