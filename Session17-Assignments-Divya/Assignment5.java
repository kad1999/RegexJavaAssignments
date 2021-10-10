import java.util.Scanner;

public class Assignment5 {
	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String[] sArr = s.split("\\s");
		StringBuffer[] sbArr;
		for(String sr: sArr) {
			StringBuffer sb = new StringBuffer(sr);
			System.out.print(sb.reverse()+" ");
		}
		
	}
}
