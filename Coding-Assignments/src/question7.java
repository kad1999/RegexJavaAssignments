import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class question7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input string");
		String[] s = sc.nextLine().split(" ");
		LinkedHashMap<String, Integer> map = new LinkedHashMap <String, Integer>();
		for (int i = 0; i < s.length; i++) {
			if(map.containsKey(s[i])) {
				map.put(s[i], map.get(s[i])+1);
			}else {
				map.put(s[i], 1);
			}
		}
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" = "+entry.getValue());			
		}
	}
}
