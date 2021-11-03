
public class GCCase1 {
	public static void main(String[] args) {
		Student s = new Student();
		s = null;
		System.gc();
	}
}
