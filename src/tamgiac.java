import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class tamgiac {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println(" nhap ba so a, b, c=");
		int a = key.nextInt();
		int b = key.nextInt();
		int c = key.nextInt();
		if ((a + b < c) || (a + c < b) && (b + c < a)) {
			System.out.println(a + " " + b + " " + c + " pai la 3 canh cua 1 tam giac");
		} else {
			if ((Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))
					|| (Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2))
					|| (Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(b, 2))) {
				System.out.println(a + " " + b + " " + c + " la 3 canh cua 1 tam giac vuong");
			} else {

				System.out.println(a + " " + b + " " + c + " la ba canh cua 1 tam giac");
			}
		}
	}
}