import java.util.HashSet;

public class Assignment1 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
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
