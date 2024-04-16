package OOP;

public class testMTbotui {
public static void main(String[] args) {
	System.out.println("kiem tra cau a:");
	MaytinhCasioFX500 M1 = new MaytinhCasioFX500();
	MaytinhVinaCal500 M2 = new MaytinhVinaCal500();
	System.out.println("test cau a:");	
	System.out.println("2+3=" + M1.Tong(2,3));
	System.out.println("7-4=" + M2.hieu(7,4));
	System.out.println("4x5=" + M1.Tich(4,5));
	System.out.println("6/4=" + M1.Thuong(6,4));
	System.out.println("--------------------");
	System.out.println("tes cau b:");
	double[] arr1 = new double[] {2,6,4,8,3,9,5};
	double[] arr2 = new double[] {1,4,7,3,9,2,6};
	
	SxChen sxchen = new SxChen();
	SxChon sxchon = new SxChon();
	
	sxchen.SXTang(arr1);
	for (int i = 0; i< arr1.length;i++) {
		System.out.print(arr1[i]+" ");
	}
	System.out.println();
	sxchon.SXGiam(arr2);
	for(int i=0;i<arr2.length;i++) {
		System.out.print(arr2[i]+" ");
	}
	System.out.println();
	System.out.println("----------------");
	System.out.println("test cau c:");
	PhanMemMT pm = new PhanMemMT();
	System.out.println("3*4=" + pm.Tich(3,4));
	double[] arr3 = new double[] {3,5,8,3,2,9,1};
	pm.SXGiam(arr3);
	for (int i = 0;i<arr3.length;i++) {
		System.out.print(arr3[i]+" ");
	}
			
}
}
