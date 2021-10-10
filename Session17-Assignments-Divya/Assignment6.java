import java.util.Scanner;

public class Assignment6 {
	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuffer sb = new StringBuffer(s);
		
		sb.setCharAt(0,Character.toUpperCase(sb.charAt(0)));
		for(int i=1;i<s.length();i++) {
			if(sb.charAt(i)==' ') {
				sb.setCharAt(i+1,Character.toUpperCase(sb.charAt(i+1)));
			}
		}
		
		System.out.println("After converting to title case");
		System.out.println(sb.toString());
		
	}
}
