import java.util.Scanner;

public class Assignment4 {
	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(s);
		System.out.println("Reverse is "+sb.reverse());
	}
}
