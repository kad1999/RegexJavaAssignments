class Outer{
	public void method1() {
		class Inner{
			public void m1() {
				System.out.println("m1");
			}
		}
		Inner i = new Inner();
		i.m1();
	}
}
public class MethodLocalInnerDemo {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.method1();
	}
}
