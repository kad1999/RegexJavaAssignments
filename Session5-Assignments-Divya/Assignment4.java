import java.util.*;

public class Assignment4 {
	public static void main(String[] args) {
		//Sales commission app
		System.out.println("Enter sales");
		Scanner sc = new Scanner(System.in);
		int sales = sc.nextInt();
		int comm=0;
		if(sales>=0 && sales<=10000) {
			comm = 0;
		}
		else if(sales>=10001 && sales<=20000) {
			comm = 10;
		}
		else if(sales>=20001 && sales<=30000) {
			comm = 20;
		}
		else if(sales>=30001) {
			comm = 25;
		}
		float total = sales+sales*comm/100;
		System.out.println("Sales Amount : "+sales);
		System.out.println("Commission : "+comm);
		System.out.println("Total      : "+total);
		
	}
}
