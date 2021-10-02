import java.util.*;
interface Calculator{
	void sum(int num1, int num2);
	void sub(int num1, int num2);
	void mul(int num1, int num2);
	void div(int num1, int num2);
	
}

class MyCalculatorImp implements Calculator{
	public void sum(int num1, int num2) {
		System.out.println("ADDITION    : "+(num1+num2));
	}
	public void sub(int num1, int num2) {
		System.out.println("SUBTRACTION : "+(num1-num2));
	}
	public void mul(int num1, int num2) {
		System.out.println("MULTIPLICATION : "+(num1*num2));
	}
	public void div(int num1, int num2) {
		if (num2!=0)
			System.out.println("DIVISION   : "+((float)num1/num2));
		else
			System.out.println("Division by zero not possible");
	}
}
public class Assignment1 {
	public static void main(String[] args) {
		MyCalculatorImp cal = new MyCalculatorImp();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		
		System.out.println("--- CALCULATOR RESULTS---");
		cal.sum(num1, num2);
		cal.sub(num1, num2);
		cal.mul(num1, num2);
		cal.div(num1, num2);
		sc.close();
	}
}
