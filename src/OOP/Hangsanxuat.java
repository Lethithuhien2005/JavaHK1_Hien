package OOP;

public class Hangsanxuat {
	private String nameHangSX;
	private String country;

	public Hangsanxuat(String nameHangSX, String country) {
		this.nameHangSX = nameHangSX;
		this.country = country;
	}

	public String getNameHangSX() {
		return nameHangSX;
	}

	public void setNameHangSX(String nameHangSX) {
		this.nameHangSX = nameHangSX;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String tenHangSX() {
		return this.nameHangSX;
	}
}
