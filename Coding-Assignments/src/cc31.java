import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cc31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> nums   = new ArrayList<Integer>();
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		System.out.println("Enter elements of arrays");
		for (int i = 0; i < n; i++) {
			nums.add(sc.nextInt());
		}
		
		int  i=0, j=n-1, width=0, ans=-1, currArea;
		int left, right;
		while(i<j) {
			left = nums.get(i);
			right = nums.get(j);
			width = j-i;
			currArea = Math.min(left, right)*width;
			ans = currArea>ans?currArea:ans;
			
			if(left<right) {
				++i;
			}else if(right<left) {
				--j;
			}else {
				
				++i;
				--j;
			}
			
		}
		
		System.out.println("Maximum water held by container is "+ans);
		sc.close();
	}
}
