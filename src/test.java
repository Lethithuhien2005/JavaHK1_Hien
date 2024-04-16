
public class test {
	public static void main(String[] args) {
		equals_method date1 = new equals_method(4, 12, 1992);
		equals_method date2 = new equals_method(25, 8, 2005);
		equals_method date3 = new equals_method(4, 12, 1992);
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		System.out.println(" date1 equal to date2: " + date1.equals(date2));
		System.out.println(" date1 equal to date3: " + date1.equals(date3));
	}
	
}
