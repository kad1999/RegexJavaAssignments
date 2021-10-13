import java.util.ArrayList;
import java.util.ListIterator;

public class Assignment1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Java");
		al.add("Angular");
		al.add("ReactJS");
		al.add("Javascript");
		al.add("Python");
		
		System.out.println("Using for loop : ");
		for(Object obj: al) {
			System.out.println(obj);
		}
		
		System.out.println("Using iterator : ");
		ListIterator itr = al.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
}
}
