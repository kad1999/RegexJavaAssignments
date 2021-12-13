import java.util.Iterator;
import java.util.Scanner;

public class cc2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input string");
		String s = sc.next();
		int maxl=0, l=0;
		String currStr = "";
		for (int i = 0; i < s.length(); i++) {
			currStr = "";
			for (int j = i; j <s.length(); j++) {
				if(!currStr.contains(Character.toString(s.charAt(j)))) {
					currStr+=s.charAt(j);
				}else {
					l = currStr.length();
					maxl = Math.max(maxl, l);
					break;
				}
			}
		}
		System.out.println("Max length of substring without no repeating characters "+maxl);
	}
}
