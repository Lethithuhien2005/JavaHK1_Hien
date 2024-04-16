package Array;

import java.util.Scanner;

public class SX_cotGiamdan {
	public static void Array() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number of row's and collum's element: ");
		int n = sc.nextInt();
		int Arr[][] = new int[n][n];
		System.out.println("Input elements");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Arr[" + i + "][" + j + "]=");
				Arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix has entered: ");
		for (int i=0; i<n;i++) {
			for (int j=0;j<n;j++) {
				System.out.print(Arr[i][j] + "\t");
			}
			System.out.println();
		}
		for (int i=0;i<n;i++) {
			int max = Arr[0][i];
			for (int j=0;j<n-1;j++) {
				if (max<Arr[j+1][i]) {
					int t = max;
					Arr[j][i] = Arr[j+1][i];
					Arr[j+1][i] = t;
				}
			}
		}
		System.out.println("the Array after arranging: ");
		for (int i=0; i<n;i++) {
			for (int j=0;j<n;j++) {
				System.out.print(Arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Array();
	}
}
