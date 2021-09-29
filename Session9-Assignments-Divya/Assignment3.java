class Employee{
	int id;
	String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void getEmployeeName() {
		System.out.println("Name "+this.name);
	}
	public void getEmployeeID() {
		System.out.println("ID "+this.id);
	}
}

class PermanentEmployee extends Employee{
	PermanentEmployee(int id, String name){
		super(id, name);
	}
	public void salaryOnMonthly() {
		System.out.println("Monthly salary");
	}
}
class ContractEmployee extends Employee{
	
	public ContractEmployee(int id, String name) {
		super(id, name);
	}

	public void salaryOnHourly() {
		System.out.println("Hourly salary");
	}
}
public class Assignment3 {
	public static void main(String[] args) {
		PermanentEmployee pEmp = new PermanentEmployee(1, "karan");
		
		ContractEmployee cEmp = new ContractEmployee(2,"diya");
		System.out.println("Permannet employee");
		pEmp.getEmployeeID();
		pEmp.getEmployeeName();
		
		System.out.println("Contract employee");
		cEmp.getEmployeeID();
		cEmp.getEmployeeName();
		
	}
}
