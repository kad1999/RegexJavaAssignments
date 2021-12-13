import java.util.Scanner;

public class cc4 {
	public static void main(String[] args) {
		int[] vals = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		StringBuilder  result = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a integer number");
		int num = sc.nextInt();
		for (int i = 0; i < roman.length; i++) {
			while(num >= vals[i]) {
				num = num-vals[i];
				result.append(roman[i]);
			}
		}
	
		
		System.out.println("Roman value is "+result);
		
		sc.close();
	}
}
