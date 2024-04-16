import java.util.Scanner;

public class java_dayofmonth {
	public static void main(String[] args) {
		Scanner key= new Scanner(System.in);
		System.out.println("nhap nam=");
		System.out.println(" nhap n=");
		int nam=key.nextInt();
		int n=key.nextInt();
		switch (n) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("thang " + n + " co 31 ngay");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(" thang " + n + " co 30 ngay");
			break;
		default :
			if ((nam%400==0) || ((nam%4==0) && ( nam%100!=0))) {
			System.out.println(" thang" + n + " co 29 ngay");
			} else {
				System.out.println(" thang " + n + " co 28 ngay");
}
			break;
		}
	}
}