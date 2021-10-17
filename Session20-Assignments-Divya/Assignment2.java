import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Assignment2 {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> hm= new LinkedHashMap<String, Integer>();
		hm.put("Java Full Stack", 150);
		hm.put("Python full stack", 150);
		hm.put("UI Full Stack",80);
		
		Set s = hm.entrySet();
		Iterator i = s.iterator();
		
		while (i.hasNext()) {
			Map.Entry mapEntry = (Map.Entry)i.next();
			
			System.out.println("Course : "+mapEntry.getKey()+", Duration : "+mapEntry.getValue());
		}
	}
}
