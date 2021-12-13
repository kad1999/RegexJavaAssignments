import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class question6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input string");
		String s = sc.nextLine();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap <Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char character = s.charAt(i);
			if(map.containsKey(character)) {
				map.put(character, map.get(character)+1);
			}else {
				map.put(character, 1);
			}
		}
		
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"="+entry.getValue());			
		}
	}
}
