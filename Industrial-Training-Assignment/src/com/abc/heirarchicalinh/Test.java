package com.abc.heirarchicalinh;
class Employee{
	void getEmployeeName(String name){
		System.out.println("Name - "+name);
	}
	void getEmployeeId(int id) {
		System.out.println("ID - "+id);
	}
}

class PermanentEmployee extends Employee{
	void SalaryOnMonthly(){
		System.out.println("Monthly salary");
	}
}

class ContractEmployee extends Employee{
	void salaryOnHourly() {
		System.out.println("Hoyrly salary");
	}
}
public class Test {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.getEmployeeId(1);
		emp.getEmployeeName("karan");
		
		System.out.println("Permanent employee");
		PermanentEmployee pEmp = new PermanentEmployee();
		pEmp.getEmployeeId(2);
		pEmp.getEmployeeName("riya");
		pEmp.SalaryOnMonthly();
		
		System.out.println("Contract employee");
		ContractEmployee cEmp = new  ContractEmployee();
		cEmp.getEmployeeId(3);
		cEmp.getEmployeeName("raj");
		cEmp.salaryOnHourly();
		
	}
}
