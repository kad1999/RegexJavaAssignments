import java.util.Scanner;

public class question3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input string");
		String lst = sc.nextLine();
		int space = 0;
		int chars = 0;
		for (int i = 0; i < lst.length(); i++) {
			if(lst.charAt(i)==' ') {
				space++;
			}else {
				chars++;
			}
		}
		
		System.out.println("No of words : "+(space+1));
		System.out.println("No of characters : "+chars);
	}
}
