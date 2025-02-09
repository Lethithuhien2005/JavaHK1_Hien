
public class fibonacci {

	/**
	 * Tính số fibonacci thứ n
	 * 
	 * @param n: chỉ số của số fibonacci tính từ 0 vd: F0 = 0, F1 = 1, F2 = 1, F3 =
	 *           2
	 * @return số fibonacci thứ n
	 */
	public static int fibonacci(int n) {
		if (n < 0) {
			return -1;
		} else if (n == 0 || n == 1) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	public static void main(String[] args) {
		System.out.println("1000 so dau tien trong day fibonacci: ");
		for (int i = 0; i < 1000 - 1; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}

}
