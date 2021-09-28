import java.util.Scanner;

public class Assignment1 {
	public static void evenToTen() {
		System.out.println("Even numbers upto 10 : ");
		for(int i=1;i <= 10;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	
	public static void oddToTen() {
		System.out.println("Odd numbers upto 10 : ");
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	
	public int factorial(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
		
	}
	
	public void multiplication(int n) {
		System.out.println("Multiplication table for "+n);
		for(int i=1;i<=10;i++) {
			System.out.println(i+" X "+n+" = "+i*n);
		}
	}
	
	public boolean primeNumber(int num) {
		if(num==1) {
			return false;
		}
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public int maxOfThree(int... nums) {
		return (nums[0]>nums[1])?((nums[0]>nums[2])?nums[0]:nums[2]):((nums[1]>nums[2])?nums[1]:nums[2]);
	}
	
	public void oddOrEven(int num) {
		if(num%2==0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}
	}
	public static void main(String[] args) {
		Assignment1 obj = new Assignment1();
		
		//even nos upto 10
		evenToTen();
		
		//odd numbers upto 10
		oddToTen();
		
		//find factorial
		System.out.println("Enter number to find factorial");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Factorial of "+num+" : "+obj.factorial(num));
		
		//find multiplication table
		System.out.println("Enter number to get multiplication table");
		num = sc.nextInt();
		obj.multiplication(num);
		
		//check prime or not
		System.out.println("Enter number to get check prime or not");
		num = sc.nextInt();
		if(obj.primeNumber(num)) {
			System.out.println(num+" is prime");
		}
		else {
			System.out.println(num+" is not prime");
		}
		
		//max of 3 numbers
		System.out.println("Enter 3 numbers to find maximum");
		int num1, num2, num3;
		num1= sc.nextInt();
		num2=sc.nextInt();
		num3 = sc.nextInt();
		System.out.println("Maximum number is : "+obj.maxOfThree(num1, num2,num3));
		
		//check odd or even
		System.out.println("Enter number to get check odd or even");
		num = sc.nextInt();
		obj.oddOrEven(num);
		
		
	}
}
