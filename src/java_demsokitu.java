import java.util.Scanner;

public class java_demsokitu {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("nhap vao mot chuoi");
		String str=key.nextLine();
		int count=0;
		for (int i=0; i<=str.length()- 1; i++) {
			if ((str.charAt(i)!=' ') && (str.charAt(i+1) != ' '))  {
				count=count+1;
			}
		}
	    if (str.charAt(0) != 0) {
				count=count+1;
			}
	    System.out.println(" co so ki tu la" + count);
		
		}
	}


