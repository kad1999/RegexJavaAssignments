import java.util.TreeSet;

public class Assignment3 {
	public static void main(String[] args) {
		TreeSet ts  = new TreeSet();
		ts.add("Java");
		ts.add("Angular");
		ts.add("React JS");
		ts.add("Javaacript");
		ts.add("Python");
		
		for (Object object : ts) {
			System.out.println(object);
		}
	}
}
