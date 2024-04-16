import java.util.Scanner;

public class java_henhiphan {
	public static void main(String[] args) {
		Scanner key= new Scanner(System.in);
		System.out.println(" nhap so nguyen n=");
		int n=key.nextInt();
		String nhiphan="";
		//4:2=2 du 0
		//2:2=1 du 0
		//1:2 du 1
		while (n>0) {
			nhiphan= (n%2) + nhiphan;
			n=n/2;
		}
		System.out.println("he nhi phan la:" + nhiphan);
	}

}
