import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cc1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> nums   = new ArrayList<Integer>();
		System.out.println("Enter size of array");
		int s = sc.nextInt();
		System.out.println("Enter elements of arrays");
		for (int i = 0; i < s; i++) {
			nums.add(sc.nextInt());
		}
		System.out.println("Enter target");
		int target = sc.nextInt();
		for (int i = 0; i < nums.size(); i++) {
			int y = target-nums.get(i);
			List<Integer> tnums   = new ArrayList<Integer>(nums);
			tnums.remove(i);
			if(tnums.contains(y)) {
				System.out.println("["+i+","+nums.indexOf(y)+"]");
				break;
			}
			
		}
		
		sc.close();
		
	}
}
