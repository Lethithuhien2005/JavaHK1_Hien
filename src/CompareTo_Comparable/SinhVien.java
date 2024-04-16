package CompareTo_Comparable;

public class SinhVien implements Comparable<SinhVien> {
	private int StdID;
	private String name;
	private String nameClass;
	private int avr;

	public SinhVien(int stdID, String name, String nameClass, int avr) {
		StdID = stdID;
		this.name = name;
		this.nameClass = nameClass;
		this.avr = avr;
	}

	public int getStdID() {
		return StdID;
	}

	public void setStdID(int stdID) {
		StdID = stdID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameClass() {
		return nameClass;
	}

	public void setNameClass(String nameClass) {
		this.nameClass = nameClass;
	}

	public int getAvr() {
		return avr;
	}

	public void setAvr(int avr) {
		this.avr = avr;
	}

	public String getTen() { 
		String s = this.name.trim(); // phuong thuc xoa khoang trang 2 dau
		if (s.indexOf(" ") >= 0) {
			int vitri = s.lastIndexOf(" ");
			return s.substring(vitri + 1);
		} else {
			return s;
		}
	}

	@Override
	public String toString() {
		return "SinhVien [StdID=" + StdID + ", name=" + name + ", nameClass=" + nameClass + ", avr=" + avr + "]";
	}

	@Override
	public int compareTo(SinhVien o) {
		// dua tren so sanh ten
		// ten: Adam, Barack Obama, Nguyen Van A, Le Thi Thu Hien
		String tenThis = this.getTen();
		String ten0=o.getTen();
		return tenThis.compareTo(ten0);
	}
		

//	@Override
//	public int compareTo(SinhVien o) {
//		double Average = this.getAvr();
//		double tenO = o.getAvr();
//		return Average.compareTo(tenO);
//	}

}
