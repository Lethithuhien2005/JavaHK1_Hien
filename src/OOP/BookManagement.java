package OOP;

public class BookManagement {
	private String nameBook;
	private double cost;
	private int namXB;
	private Author author;

	public BookManagement(String nameBook, double cost, int namXB, Author author) {
		this.nameBook = nameBook;
		this.cost = cost;
		this.namXB = namXB;
		this.author = author;
	}

	public String getNameBook() {
		return nameBook;
	}

	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getNamXB() {
		return namXB;
	}

	public void setNamXB(int namXB) {
		this.namXB = namXB;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public void intensach() {
		System.out.println(this.nameBook);
	}

	public boolean kiemtraCungNamXB(BookManagement sachkhac) {
//	if (this.namXB == sachkhac.namXB) {
//		return true;
//	} else {
//		return false;
//	}
		return this.namXB == sachkhac.namXB;
	}

	public double giasaukhigiam(double x) {
		return this.cost * (1 - x / 100);
	}
}
