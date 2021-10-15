import java.util.LinkedHashSet;

public class Assignmentt2 {
	public static void main(String[] args) {
		LinkedHashSet hs = new LinkedHashSet();
		hs.add("Java");
		hs.add("Angular");
		hs.add("React JS");
		hs.add("Javaacript");
		hs.add("Python");
		
		for (Object object : hs) {
			System.out.println(object);
		}
	}
}
