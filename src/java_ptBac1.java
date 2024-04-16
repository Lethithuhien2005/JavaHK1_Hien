import java.util.Scanner;

public class java_ptBac1 {
	
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("nhap a, b=");
		int a=key.nextInt();
		int b=key.nextInt();
		// pt ax+b=0;
		if (a==0) {
			// neu a=0
			if (b==0) {
				// neu ca a va b =0
				System.out.println("pt vo so nghiem");
			} else {
				System.out.println("pt vo nghiem");
			}
		} else {
			double res;
			res=(double)(-b)/a;
			// neu a khac 0
			System.out.println("pt co nghiem= " + res);
		}
		
	}
}
