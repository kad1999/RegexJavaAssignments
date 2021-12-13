import java.util.Iterator;
import java.util.Scanner;

public class question2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input string");
		String[] lst = sc.nextLine().split(" ");
		
		for (int i = lst.length-1; i >= 0 ; i--) {
			System.out.print(lst[i]+" ");
		}
	}
}
