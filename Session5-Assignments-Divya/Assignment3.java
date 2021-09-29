import java.util.*;

public class Assignment3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Gender (M/F):");
		String gender = sc.next();
		System.out.println("Enter age");
		int age = sc.nextInt();
		
		if(gender.equals("M")) {
			if(age>=25) {
				System.out.println("He is eligible for marriage");
			}
			else {
				System.out.println("He is not eligible for marriage");
			}
		}
		else if(gender.equals("F")) {
			if(age>=21) {
				System.out.println("She is eligible for marriage");
			}
			else {
				System.out.println("She is not eligible for marriage");
			}
		}
		else {
			System.out.println("Invalid gender");
		}
	}
}
