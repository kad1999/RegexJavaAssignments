import java.util.*;
public class Assignment2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		try {
		System.out.println("Enter first no");
		num1 = sc.nextInt();
		System.out.println("Enter second no");
		num2 = sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Please enter in correct format");
			System.exit(0);
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Enter choice 1. Add 2. Sub 3. Mul 4. Div");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Sum = "+(num1+num2));
				break;
			case 2:
				System.out.println("Sub = "+(num1-num2));
				break;
			case 3:
				System.out.println("Mul = "+(num1*num2));
				break;
			case 4:
				double div = 0;
				try {
				div = num1/num2;
				}catch(ArithmeticException e) {
					System.out.println("Cannot divide by zero");
					System.exit(0);
				}finally {
					System.out.println("Div = "+div);
				}
				
				break;
			default:
				System.out.println("Wrong choice");
				break;
			}
		}
		
		
	}
}
