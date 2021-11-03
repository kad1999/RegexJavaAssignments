import java.util.ArrayList;
import java.util.function.Consumer;

public class Assignment3 {
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(10);
		ar.add(15);
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		
		ar.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer i) {
				System.out.println(i);
			}
			
		});
	}
}
