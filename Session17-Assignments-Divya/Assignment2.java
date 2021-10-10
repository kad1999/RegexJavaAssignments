import java.util.*;
public class Assignment2 {
	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuffer sb = new StringBuffer(s);
		StringBuffer sb_org = new StringBuffer(s);
		StringBuffer sb_rev = sb.reverse();
		
		if(sb_org.toString().equals(sb_rev.toString())) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}		
	}
}
