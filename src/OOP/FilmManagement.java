package OOP;

public class FilmManagement {
	private String nameFilm;
	private int namSX;
	private Hangsanxuat hang;
	private double giave;
	private ngaychieu ngay;

	public FilmManagement(String nameFilm, int namSX, Hangsanxuat hang, double giave, ngaychieu ngay) {
		super();
		this.nameFilm = nameFilm;
		this.namSX = namSX;
		this.hang = hang;
		this.giave = giave;
		this.ngay = ngay;
	}

	public String getNameFilm() {
		return nameFilm;
	}

	public void setNameFilm(String nameFilm) {
		this.nameFilm = nameFilm;
	}

	public int getNamSX() {
		return namSX;
	}

	public void setNamSX(int namSX) {
		this.namSX = namSX;
	}

	public Hangsanxuat getHang() {
		return hang;
	}

	public void setHang(Hangsanxuat hang) {
		this.hang = hang;
	}

	public double getGiave() {
		return giave;
	}

	public void setGiave(double giave) {
		this.giave = giave;
	}

	public ngaychieu getNgay() {
		return ngay;
	}

	public void setNgay(ngaychieu ngay) {
		this.ngay = ngay;
	}

	public boolean kiemtraGiave(FilmManagement filmkhac) {
		return this.giave < filmkhac.giave;
	}

	public double giavesaukhiKM(double x) {
		return this.giave - (this.giave * x / 100);
	}
}
