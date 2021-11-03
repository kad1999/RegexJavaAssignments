
public class GCCase2Demo {
public static void main(String[] args) {
	Student s1 = new Student();
	Student s2 = new Student();
	s1=s2;
	
	System.gc();
}
}
