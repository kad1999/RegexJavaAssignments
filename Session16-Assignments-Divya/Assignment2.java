import java.util.*;
class Employee {
	public int employeeId;
	public String employeeName;
	public int employeeContact;
	
	public Employee() {
		System.out.println("0 arg constructor");
	}
	
	public Employee(int employeeId, String employeeName, int employeeContact) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeContact = employeeContact;
	}
	

	public void m1() {
		System.out.println("m1");
	}
	public void m2() {
		System.out.println("m2");
	}
	public void m3() {
		System.out.println("m3");
	}
}
public class Assignment2 {
	public static void main(String[] args) {
		Employee e = new Employee();
		Class c = e.getClass();
		System.out.println(c);
		System.out.println(c.getName());
		System.out.println(Arrays.toString(c.getConstructors()));
		System.out.println(Arrays.toString(c.getMethods()));
		System.out.println(Arrays.toString(c.getFields()));
	}
}
