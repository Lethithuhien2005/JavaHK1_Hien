
public class equals_method {
	private int day;
	private int month;
	private int year;

	public equals_method(int day, int month, int year) {
		// -> lop Consturctor: muc dich la de kiem soat thong tin( tuc
		// la khong cho phep user nhap sai thong tin), thu hai la
		// muc dich cho lop ke thua
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (day >= 1 && day <= 31) {
			this.day = day;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month >= 1 && month <= 12) {
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year >= 1) {
			this.year = year;
		}
	}

////	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return this.day + "/" + this.month + "/" + this.year;
//	}

//	@Override
	public String toString() {
		return "equals_method [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
}
