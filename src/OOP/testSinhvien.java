package OOP;

public class testSinhvien {
	public static void main(String[] args) {
		Lop lop1 = new Lop("23GIT", "Khoa Hoc May Tinh");
		Lop lop2 = new Lop("23IT3B", "Khoa Hoc May Tinh");

		NgaysinhSV day1 = new NgaysinhSV(25, 8, 2005);
		NgaysinhSV day2 = new NgaysinhSV(27, 7, 2005);

		QuanlySinhvien sv1 = new QuanlySinhvien("23IT071", "Le Thi Thu Hien", day1, 8.9, lop1);
		QuanlySinhvien sv2 = new QuanlySinhvien("23IT.B088", "Ta Kim Huong", day2, 8.8, lop2);

		System.out.println("sinh vien 1: " + lop1.chobietTenKhoa());
		System.out.println("sinh vien 2: " + lop2.chobietTenKhoa());

		System.out.println("sinh vien 1 dau hay khong: " + sv1.kiemtraDau());
		System.out.println("sinh vien 2 dau hay khong: " + sv2.kiemtraDau());

		System.out.println("ngay sinh cua sinh vien 1 giong sinh vien 2 : " + sv1.kiemtraNgaySinh(sv2));

	}
}
