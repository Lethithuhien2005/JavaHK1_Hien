package Array;

import java.util.Arrays;

public class Array_HamcoSan {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 5, 2, 8, 3, 9, 6 };
		int[] b = new int[15];

		System.out.println("a ban dau: " + Arrays.toString(a));

		// ham sap xep tang dan:
		Arrays.sort(a);
		System.out.println("a sau khi sap xep: " + Arrays.toString(a));

		// ham tim kiem : chi su dung khi mang da duoc sap xep tang dan
		// ham tim kiem tra ve vi tri (chi so) cua phan tu duoc tim kiem
		System.out.println(Arrays.binarySearch(a, 3));
		System.out.println(Arrays.binarySearch(a, 7));

		// ham sap xep giam dan: 
		a=Reverse(a);
		System.out.println("a sau khi sap xep giam dan: " + Arrays.toString(a));
		
		// ham dien gia tri:
		Arrays.fill(b, 5);
		System.out.println("b: " + Arrays.toString(b));
	
	}

	// phuong thuc dao nguoc mang: CACH 1
	public static int[] Reverse(int[] x) {
		int[] rs = new int[x.length];
		int index = 0;
		for (int i = x.length - 1; i >= 0; i--) {
			rs[index] = x[i];
			index++;
		}
		return rs;
	}
	// phuong thuc dao nguoc mang CACH 2:
//		for (int i = 0, j = a.length - 1; i < j; i++, j--) {
//			/* Tạo biến temp và tiến hành hoán đổi phần tử */
//			int temp = a[i];
//			a[i] = a[j];
//			a[j] = temp;
//		}
//		System.out.println(Arrays.toString(a));
//
//	}
}