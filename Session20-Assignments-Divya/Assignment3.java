import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Assignment3 {
	public static void main(String[] args) {
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		
		tm.put("Java Full Stack", 150);
		tm.put("Python full stack", 150);
		tm.put("UI Full Stack",80);
		
		Set s = tm.entrySet();
		
		for (Object object : s) {
			Map.Entry<String, Integer> mapEntry = (Map.Entry)object;
			System.out.println("Course - "+mapEntry.getKey()+", Duration - "+mapEntry.getValue());
		}
	}
}
