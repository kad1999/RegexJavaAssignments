import java.util.Arrays;

interface Wish1{
	void greetings();
}
public class Assignment2 {
	static void greet() {
		System.out.println("Hello");
	}
	void welcome() {
		System.out.println("Welcome");
	}
	public static void main(String[] args) {
		Wish1 w = ()->Assignment2.greet();
		w.greetings();
		
		Wish1 w1 = Assignment2 :: greet;
		w1.greetings();
		
		Wish1 w2 = ()->new Assignment2().welcome();
		w2.greetings();
		
		
		String[] courses = {"java", "python","html"};
		
		Arrays.sort(courses, String :: compareTo);
		System.out.println(Arrays.toString(courses));
	}
}
