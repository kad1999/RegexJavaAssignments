interface Calc1{
	int findCube(int num);
}

public class Assignment1 {
	public static void main(String[] args) {
		Calc1 c = new Calc1() {
			public int findCube(int num) {
				return num*num*num;
			}
		};
		
		System.out.println(c.findCube(4));
		
		Calc1 c2 = (int x)->{
			return x*x*x;
		};
		
		System.out.println(c2.findCube(5));
		
		Calc1 c3 = x -> x*x*x;
		System.out.println(c3.findCube(7));
	}
}