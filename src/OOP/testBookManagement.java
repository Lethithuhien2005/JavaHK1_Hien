package OOP;

public class testBookManagement {
	public static void main(String[] args) {
		Date_of_birth date1 = new Date_of_birth(2, 10, 1978);
		Date_of_birth date2 = new Date_of_birth(13, 10, 1967);
		Date_of_birth date3 = new Date_of_birth(24, 5, 1971);
		Author author1 = new Author("Nguyen Van A", date1);
		Author author2 = new Author("Tran Hoang C", date2);
		BookManagement book1 = new BookManagement("Lap trinh Java", 575000, 2023, author1);
		BookManagement book2 = new BookManagement("Lap trinh C", 480000, 2021, author2);

		book1.intensach();
		book2.intensach();

		System.out.println("so sanh nam xuat ban cua book1 va book2: " + book1.kiemtraCungNamXB(book2));

		System.out.println("gia book1 sau khi giam 10%: " + book1.giasaukhigiam(10));
		System.out.println("gia book2 sau khi giam 25%: " + book2.giasaukhigiam(25));
	}
}
