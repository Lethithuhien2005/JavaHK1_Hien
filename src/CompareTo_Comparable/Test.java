package CompareTo_Comparable;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {

		SinhVien std1 = new SinhVien(01, "Lee Soo Yoon", "23Git", 8);
		SinhVien std2 = new SinhVien(02, "Kim Ga Eun", "23Git", 7);
		SinhVien std3 = new SinhVien(03, "Kim Seok Jin", "Bangtan", 9);
		//So sanh dua tren ki tu ten
		System.out.println(std1.compareTo(std2));
		System.out.println(std2.compareTo(std3));
			
//		So sanh dua tren diem trung binh
		
		SinhVien[] arr_sv = new SinhVien[] {std1, std2, std3};
		System.out.println("ban dau: " + Arrays.toString(arr_sv));
		// Ham sap xep:
		Arrays.sort(arr_sv);
		System.out.println("sau khi sap xep: " + Arrays.toString(arr_sv)
		);
		
	
	}
}

