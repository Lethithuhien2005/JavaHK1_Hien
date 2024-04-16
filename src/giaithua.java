import java.util.Scanner;

public class giaithua {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println(" nhap so nguyen n=");
		int n = key.nextInt();
		int giaithua = 1;
		for (int i = 1; i < n; i++) {
			
			giaithua = giaithua * (i + 1);
		}
		System.out.println(n + "! = " + giaithua);
	}

}
