package OOP;

public class testComputer {
	public static void main(String[] args) {
		Quocgia QG1 = new Quocgia("1", "Japan");
		Quocgia QG2 = new Quocgia("2", "China");
		Quocgia QG3 = new Quocgia("3", "the USA");

		HangSX hang1 = new HangSX("Toshiba", QG1);
		HangSX hang2 = new HangSX("Acer", QG2);
		HangSX hang3 = new HangSX("Dell", QG3);

		NgaySX ngay1 = new NgaySX(2, 4, 1983);
		NgaySX ngay2 = new NgaySX(3, 7, 1987);
		NgaySX ngay3 = new NgaySX(14, 9, 1980);

		ComputerManagement com1 = new ComputerManagement(hang3, ngay1, 17000000, 2);
		ComputerManagement com2 = new ComputerManagement(hang1, ngay2, 8000000, 1);
		ComputerManagement com3 = new ComputerManagement(hang2, ngay3, 24000000, 2);

		System.out.println("gia ban cua may 1 thap hon may 2: " + com1.KTgia(com2));
		System.out.println("gia ban cua may 1 thap hon may 3: " + com1.KTgia(com3));

		System.out.println("ten quoc gia sx may 1: " + QG1.inTenQG());
		System.out.println("ten quoc gia sx may 2: " + QG2.inTenQG());
		System.out.println("ten quoc gia sx may 3: " + QG3.inTenQG());
	}
}
