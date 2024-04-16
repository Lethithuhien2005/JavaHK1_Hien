package OOP;

public class Quocgia {
	private String MaQG;
	private String tenQG;

	public Quocgia(String maQG, String tenQG) {
		MaQG = maQG;
		this.tenQG = tenQG;
	}

	public String getMaQG() {
		return MaQG;
	}

	public void setMaQG(String maQG) {
		MaQG = maQG;
	}

	public String getTenQG() {
		return tenQG;
	}

	public void setTenQG(String tenQG) {
		this.tenQG = tenQG;
	}

	public String inTenQG() {
		return this.tenQG;
	}
}
