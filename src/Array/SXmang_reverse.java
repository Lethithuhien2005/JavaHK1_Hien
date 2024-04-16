package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SXmang_reverse {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Input number of element: ");
		int n = key.nextInt();
		int arr[] = new int[n];
		System.out.println("Input elements of array: ");
		for (int i = 0; i < n; i++) {
			System.out.println("arr[" + i + "]=");
			arr[i] = key.nextInt();
		}
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
