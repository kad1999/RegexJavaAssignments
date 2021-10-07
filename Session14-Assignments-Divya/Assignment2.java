class Addition{
	public synchronized void addTable(int n) {
		System.out.println("Additon table of "+n);
		for(int i=1;i<=10;i++) {
			System.out.println(i+"+"+n+"="+(i+n));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Thread1 extends Thread{
	Addition t;
	Thread1(Addition t){
		this.t = t;
	}
	
	public void run() {
		t.addTable(5);
	}
}

class Thread2 extends Thread{
	Addition t1;
	Thread2(Addition t1){
		this.t1 = t1;
	}
	
	public void run() {
		t1.addTable(10);
	}
	
}




public class Assignment2 {
	public static void main(String[] args) {
		Addition a = new Addition();
		Thread1 t1 = new Thread1(a);
		Thread2 t2  = new Thread2(a);
		
		t1.start();
		t2.start();
	}
}
