import java.util.ArrayList;
import java.util.stream.Collectors;

public class Assignment4 {
	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(10);
		ar.add(15);
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		ar.stream()
		.filter(num -> num%2==0)
		.forEach(System.out::println);
		
		ar.stream()
		.map(num->num+num)
		.collect(Collectors.toList())
		.forEach(System.out::println);
	}
}
