/*Một người chơi sẽ có tài khoản. 
 * Người chơi có quyền đặt cược số tiền ít hơn hoặc bằng
 * số tiền họ đang có
 * Luật chơi:
 * có 3 viên xúc xắc. mỗi xúc xắc có 6 mặt từ 1 -> 6
 * tình huống 1: 
 * 		- nếu tổng = 3 hoặc = 18 => thua
 * tình huống 2:
 * 		- nếu tổng = ( 4 -> 10) =>  xỉu -> dặt xỉu thì thắng, ngược lại thì thua
 * tình huống 3:
 * 		- nếu tổng = (11 -> 17) => tài -> dặt tài thì thắng, ngược lại thì thua 
 */

import java.util.Scanner;

public class Tai_Xiu {
	public static void main(String[] args) {
		double taiKhoan = 5000;
		Scanner key = new Scanner(System.in);
		do {
			System.out.println("---------OPTIONS---------");
			System.out.println(" 1. Continue Playing");
			System.out.println(" 2. Exit");
			int choose = key.nextInt();
			switch (choose) {
			case 1: 
				System.out.println("Start Playing:");
				System.out.println("Your balance: " + taiKhoan);
				System.out.println("ban muon cuoc bao nhieu: ");
				double soTiencuoc=0;
				do {
					System.out.println(" 0 < so tien dat cuoc <= " + taiKhoan);
					soTiencuoc =key.nextDouble();
	
				} while (soTiencuoc<=0 || soTiencuoc>taiKhoan);
				int 
			}
		}
}
}