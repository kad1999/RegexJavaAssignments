import java.util.*;
public class Assignment1 {
	public static void main(String[] args) {
		int n,a[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		n = sc.nextInt();
		a=new int[n];
		
		System.out.println("Enter elements : ");
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		
		for (int i : a) {
			if(i>max) {
				max = i;
			}
		}
		for (int i : a) {
			if(i<min) {
				min = i;
			}
		}
		
		System.out.println("Maximum element in array : "+max);
		System.out.println("Minimum element in array : "+min);
		
		Arrays.sort(a);
		System.out.println("Sorted array is : "+Arrays.toString(a));
	}
}
