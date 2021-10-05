//2nd method uding runnable interface
class RunnableThread implements Runnable{
	public void run() {
		for(int i=1;i<10;i++) {
			System.out.println("Child");
		}
	}
}

public class RunnableInterfaceDemo {
	public static void main(String[] args) {
		RunnableThread r = new RunnableThread();
		Thread t = new Thread(r);
		t.start();// for this thread object is used.Only zero argument run method will only be executed internally.
		
		for(int i=1;i<10;i++) {
			System.out.println("Parent");
		}
	}
}
