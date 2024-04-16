package OOP;

public class testFilm {
public static void main(String[] args) {
	ngaychieu day1 = new ngaychieu(3,2,2023);
	ngaychieu day2 = new ngaychieu(25,8,2023);
	ngaychieu day3 = new ngaychieu(4,12,2023);
	
	Hangsanxuat hang1 = new Hangsanxuat("ABC", "Korea");
	Hangsanxuat hang2 = new Hangsanxuat("JDK", "the USA");
	Hangsanxuat hang3 = new Hangsanxuat("102","Viet Nam");
	
	FilmManagement film1 = new FilmManagement("the Glory",2022, hang1,150000,day2);
	FilmManagement film2 = new FilmManagement("Nha Ba Nu",2023, hang3, 120000,day3);
	FilmManagement film3 = new FilmManagement("Avarta",2014,hang2,180000,day1);
			
	System.out.println("kiem tra gia ve film1 co re hon film2 khong: " + film1.kiemtraGiave(film2));	
	System.out.println("kiem tra gia ve film2 co re hon film3 khong: " + film2.kiemtraGiave(film3));
	System.out.println("kiem tra gia ve film1 co re hon film3 khong: " + film1.kiemtraGiave(film3));
	
	System.out.println("ten cua hang san xuat phim 1: " + hang1.tenHangSX());
	System.out.println("ten cua hang san xuat phim 2: " + hang2.tenHangSX());
	System.out.println("ten cua hang san xuat phim 3: " + hang3.tenHangSX());
	
	System.out.println("gia ve cua film 1 sau khi khuyen mai 15%: " + film1.giavesaukhiKM(15));
	System.out.println("gia ve cua film 2 sau khi khuyen mai 30%: " + film2.giavesaukhiKM(30));
	System.out.println("gia ve cua film 3 sau khi khuyen mai 22%: " + film3.giavesaukhiKM(0));
	
}
}
