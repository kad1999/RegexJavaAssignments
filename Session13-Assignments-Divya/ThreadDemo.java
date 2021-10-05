class ChildThread extends Thread{
	public void run() {
		//defining job
		for(int i=0;i<=5;i++) {
			System.out.println("Child");
		}
	}
}
public class ThreadDemo{
	public static void main(String[] args) {
		ChildThread t1 = new ChildThread();
		t1.start();
		
	}
}
