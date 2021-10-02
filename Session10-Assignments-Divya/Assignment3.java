@FunctionalInterface
interface MyFunctionInterface{
	void name(String name);
}

class  MyFunctionInterfaceImp implements MyFunctionInterface{
	public void name(String name) {
		System.out.println("Name : "+name);
	}
}
public class Assignment3 {
	public static void main(String[] args) {
		MyFunctionInterfaceImp func = new MyFunctionInterfaceImp();
		
		func.name("Karan");
	}
}
