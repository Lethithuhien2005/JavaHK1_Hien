package BaiTapAbstrac_Inher;

public class XeDap extends Transport{

	public XeDap(String tenLoaiPT, HangSX tenHang) {
		super("Xe dap", tenHang);
	}

	@Override
	public double layVanToc() {
		return 20;
	}

}
