import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Assignment1 {
	public static void main(String[] args) {
		HashMap<String, Integer> hm= new HashMap<String, Integer>();
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
