import java.util.Scanner;

public class java_ptBachai {

	public static void main(String[] args) {
		//pt bac hai: ax^2+bx+c=0
		double a, b, c, delta, x1, x2;
		Scanner key = new Scanner(System.in);
		System.out.println("nhap a=");
		a=key.nextDouble();
		System.out.println("nhap b=");
		b=key.nextDouble();
		System.out.println("nhap c=");
		c=key.nextDouble();
		delta= Math.pow(b,2) - 4*a*c;
		if (a==0) {
			if (b!=0) {
			System.out.println("pt co nghiem=" + ((-c)/b));
			} else {
				System.out.println("pt vo nghiem");
			}
		} else {
			if (delta<0) {
			System.out.println("pt vo nghiem");
		} else if (delta==0) {
			System.out.println(" pt co 1 nghiem=" + ((-b)/2*a));
		} else {
			x1=((-b)+ Math.sqrt(delta))/(2*a);
			x2=((-b) - Math.sqrt(delta))/(2*a);
			System.out.println(" pt co 2 nghiem : x1=" + x1 + "x2=" +x2);
		}
	}
	}
}
		

