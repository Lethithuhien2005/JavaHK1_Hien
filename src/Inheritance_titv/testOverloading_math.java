package Inheritance_titv;

public class testOverloading_math {
public static void main(String[] args) {
	Overloading_Math math = new Overloading_Math();
	System.out.println(math.timMin(5,5));
	System.out.println(math.timMin(5.5,6.3));
	System.out.println(math.tinhTong(3,6));
	double arr[] = new double[] {1.1,4.5,3.4,2.3,4.7};
	System.out.println(math.tinhTong(arr));

}
}

