import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class Assignment3 {
	public static void main(String[] args) {
		Vector v = new Vector();
		
		v.addElement("Java");
		v.addElement("Angular");
		v.addElement("ReactJS");
		v.addElement("Javascript");
		v.addElement("Python");
		
		
		System.out.println("Using for loop : ");
		for(Object obj: v) {
			System.out.println(obj);
		}
		System.out.println("Using iterator : ");
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
