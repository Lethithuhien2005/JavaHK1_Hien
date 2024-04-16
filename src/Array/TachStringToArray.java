package Array;

import java.util.Arrays;

public class TachStringToArray {
	public static void main(String[] args) {
		 String s = "My name is Lee Soo Yoon, I'm a student";
		 
		 String[] arr = s.split(" ");
		 System.out.println(Arrays.toString(arr));
		 
		 String[] b =s.split(",");
		 System.out.println(Arrays.toString(b));
		 
		 String str = "Hello, I'm Kim Seok Jin. I'm a singer!";
		 String[] c = str.split("\\,|\\.");
		 System.out.println(Arrays.toString(c));
		 System.out.println("name: " + c[1]);
		 
}
}