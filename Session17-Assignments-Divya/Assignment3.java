import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String[] sArr = s.split("\\s");
		System.out.println("Number of words in string is "+sArr.length);
	}
}
