import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question1 {
	public static void main(String[] args) {
		
		System.out.println("Enter a string input");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s=null;
		try {
			s = br.readLine().split(" ");
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (String string : s) {
			StringBuffer sb = new StringBuffer(string);
			System.out.print(sb.reverse()+" ");
		}
	}
}
