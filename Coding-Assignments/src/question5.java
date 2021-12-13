import java.util.Scanner;

public class question5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input number");
		int num = sc.nextInt();
		int temp = num;
		int rev = 0, d, s=0, cnt=0;
		
		while(temp!=0) {
			d = temp%10;
			s+=d;
			cnt+=1;
			rev = rev*10+d;
			temp = temp/10;
		}
		System.out.println("Sum : "+s);
		System.out.println("Reverse : "+rev);
		System.out.println("Count : "+cnt);
		
	}
}
