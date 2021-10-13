import java.util.LinkedList;
import java.util.ListIterator;

public class Assignment2 {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("Java");
		l.add("Angular");
		l.add("ReactJS");
		l.add("Javascript");
		l.add("Python");
		
		System.out.println("Using for loop : ");
		for(Object obj: l) {
			System.out.println(obj);
		}
		System.out.println("Using iterator : ");
		ListIterator itr = l.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
