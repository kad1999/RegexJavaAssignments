
public class GCCase4 {
	public static void m1() {
		Student s = new Student();
		System.out.println("M1()");
	}
	public static void main(String[] args) {
		m1();
		System.gc();
	}
}
