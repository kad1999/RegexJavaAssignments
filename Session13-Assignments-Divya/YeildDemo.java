package comm.abc.app5;
class ChildThread extends Thread{
	public void run() {
		//defining job
		for(int i=0;i<=5;i++) {
			System.out.println("Child");
			Thread.yield();
		}
	}
}
public class YeildDemo {
	public static void main(String[] args) {
		ChildThread t1 = new ChildThread();
		t1.start();
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(t1.getPriority());//child thread is automatically inheritiing . So child also has 5 same as parent
		t1.setPriority(10);
		System.out.println(t1.getPriority());
		for(int i=0;i<=5;i++) {
			System.out.println("Parent");
			Thread.yield();
		}
	}
}
