package OOP;

public class Author {
private String nameAuthor;
private Date_of_birth date;
public Author(String nameAuthor, Date_of_birth date) {
	this.nameAuthor = nameAuthor;
	this.date = date;
}
public String getNameAuthor() {
	return nameAuthor;
}
public void setNameAuthor(String nameAuthor) {
	this.nameAuthor = nameAuthor;
}
public Date_of_birth getDate() {
	return date;
}
public void setDate(Date_of_birth date) {
	this.date = date;
}
}
