import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConcurrentSkipListSetDemo extends Thread{
	static ConcurrentSkipListSet<String> al = new ConcurrentSkipListSet<String>();
	public void run() {
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("child thread updating list");
		al.add("Angular");	
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		al.add("python");
		al.add("java");
		al.add("html");
		//child thread
		ConcurrentSkipListSetDemo child  = new ConcurrentSkipListSetDemo();
		child.start();
		
		//main thread
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(" Main therad iterated curr elemet = "+itr.next());
			Thread.sleep(5000);
		}
		
		
		System.out.println(al);
	}
}
