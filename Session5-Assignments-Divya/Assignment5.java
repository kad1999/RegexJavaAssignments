import java.util.*;

public class Assignment5 {
	public static void main(String[] args) {
		//calculator App
		Scanner sc = new Scanner(System.in);
		String ch = "";
		do {
			int num1, num2;
			String op;
			System.out.println("-----CALCULATOR MENU------");
			System.out.println("Enter number 1");
			num1 = sc.nextInt();
			System.out.println("Enter number 2");
			num2 = sc.nextInt();
			System.out.println("Enter choice");
			System.out.println("1. ADDITION");
			System.out.println("2. SUBTRACTION");
			System.out.println("3. MULTIPLICATION");
			System.out.println("4. DIVISION");
			
			int option = sc.nextInt();
			switch(option) {
			case 1:
				int add = num1+num2;
				System.out.println("Addition : "+add);
				break;
			case 2:
				int sub = num1-num2;
				System.out.println("Subtraction : "+sub);
				break;
			case 3:
				int mul = num1*num2;
				System.out.println("Multiplication : "+mul);
				break;
			case 4:
				if(num2!=0) {
					float div = num1/num2;
					System.out.println("Division : "+div);
				}
				else {
					System.out.println("Division by zero is not possible");
				}
				break;
			default:
				System.out.println("Incorrect option");
				break;
			}
			
			System.out.println("Do you want to continue (Y/N)");
			ch = sc.next();
		}while(ch.equalsIgnoreCase("Y"));
		System.out.println("Bye");
		System.exit(0);
	}
}
