class ChildThread extends Thread{
	int total = 0;
	
	public void run() {
		synchronized(this) {
			System.out.println("2. Child thread started");
		for(int i=0;i<=100;i++) {
			total+=i;
		}
		System.out.println("3. Notification sent");
		this.notify();
	}
	}
}

public class Assignment3 {
	public static void main(String[] args) throws InterruptedException {
		ChildThread t1 = new ChildThread();
		t1.start();
		Thread.sleep(10000);
		synchronized(t1) {
			System.out.println("1. Main thread called wait method");
			t1.wait(10000);
			System.out.println("4. Main thread got notification");
			System.out.println("5. Total : "+t1.total);
		}
	}
}