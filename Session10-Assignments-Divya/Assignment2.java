import java.util.Scanner;

interface Calc{
	static void sum(int num1, int num2) {
		System.out.println("ADDITION    : "+(num1+num2));
	}
	static void sub(int num1, int num2) {
		System.out.println("SUBTRACTION : "+(num1-num2));
	}
	static void mul(int num1, int num2) {
		System.out.println("MULTIPLICATION : "+(num1*num2));
	}
	static void div(int num1, int num2) {
		if (num2!=0)
			System.out.println("DIVISION   : "+((float)num1/num2));
		else
			System.out.println("Division by zero not possible");
	}
}
public class Assignment2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		
		System.out.println("--- CALCULATOR RESULTS---");
		Calc.sum(num1, num2);
		Calc.sub(num1, num2);
		Calc.mul(num1, num2);
		Calc.div(num1, num2);
		
		sc.close();
	}
}
