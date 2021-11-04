import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentHashMapDemo extends Thread {
	static ConcurrentHashMap<Integer,String> al = new ConcurrentHashMap<>();
	public void run() {
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("child thread updating list");
		al.put(101,"Angular");	
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		al.put(102,"python");
		al.put(103,"java");
		al.put(104,"html");
		//child thread
		ConcurrentHashMapDemo child  = new ConcurrentHashMapDemo();
		child.start();
		
		//main thread
		
		Collection<String> valueSet = al.values();
		Iterator<String> itr = valueSet.iterator();
		while(itr.hasNext()) {
			System.out.println(" Main therad iterated curr elemet = "+itr.next());
			Thread.sleep(5000);
		}
		
		
		System.out.println(al);
	}
}
