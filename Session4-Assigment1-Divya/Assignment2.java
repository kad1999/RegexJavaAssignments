import java.util.*;
public class Assignment2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID : ");
		int id = sc.nextInt();
		
		System.out.println("Enter Employee Name : ");
		String name = sc.next();
		
		System.out.println("Enter Basic Salary : ");
		double salary = Double.parseDouble(sc.next());
		
		double hra = 2*salary/100;
		double pf = 3*salary/100;
		double ta = 1*salary/100;
		double esi = 2.5*salary/100;
		
		System.out.println("HRA : "+hra);
		System.out.println("PF : "+pf);
		System.out.println("TA : "+ta);
		System.out.println("ESI : "+esi);
		
		double grossPay =  salary+hra+pf+ta+esi;
		double netPay = grossPay-pf;
		System.out.println("       Salary BreakUp Application     ");
		System.out.println("=======================================");
		System.out.println("Employee ID   : "+id);
		System.out.println("Employee Name : "+name);
		System.out.println("Basic Salary  : "+salary);
		System.out.println("HRA 	  	: "+hra);
		System.out.println("PF 		: "+pf);
		System.out.println("TA 		: "+ta);
		System.out.println("ESI 	  	: "+esi);
		System.out.println("Gross Pay 	: "+grossPay);
		System.out.println("Net Pay 	: "+netPay);
	}
}
