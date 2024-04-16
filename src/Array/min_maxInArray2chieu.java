package Array;

import java.util.Arrays;
import java.util.Scanner;

public class min_maxInArray2chieu {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Input number of row's element n= :");
		int n = key.nextInt();
		System.out.println("Input number of colum's element k= :");
		int k = key.nextInt();
		int arr[][] = new int[n][k];
		System.out.println("Input elements of row and colum:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				System.out.println("arr[" + i + "][" + j + "]=");
				arr[i][j] = key.nextInt();
			}
		}

		System.out.println("Matrix has entered: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

		int minarr = arr[0][0];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				if (arr[i][j] < minarr) {
					minarr = arr[i][j];
				}
			}
		}
		System.out.println("min of arr: " + minarr);

		int maxarr = arr[0][0];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				if (arr[i][j] > maxarr) {
					maxarr = arr[i][j];
				}
			}
		}
		System.out.println("max of arr: " + maxarr);
		
		for (int i = 0; i < n; i++) {
			int minrow = arr[i][0];
			for (int j = 0; j < k; j++) {
				if (arr[i][j] < minrow) {
					minrow = arr[i][j];
				}
			}
			System.out.println("min of row " + (i + 1) + " is: " + minrow);
		}
		
		for (int i = 0; i < n; i++) {
			int maxcol = arr[i][0];
			for (int j = 0; j < k; j++) {
				if (arr[i][j] > maxcol) {
					maxcol = arr[i][j];
				}
			}
			System.out.println("max of row " + (i + 1) + " is: " + maxcol);
		}
	}
}
