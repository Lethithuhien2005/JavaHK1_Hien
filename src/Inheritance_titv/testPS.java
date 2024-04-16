package Inheritance_titv;

public class testPS {
public static void main(String[] args) {
	System.out.println("kiem tra:");
	Person per1 = new Person("le thi thu hien",2005);
//	per1.Eat();
//	per1.Drink();
	
	Student std1 = new Student("le thi thu hien",2005, "23GIT", "VKU");
	std1.Eat();
	std1.Drink();
	std1.lamBT();
}
}
