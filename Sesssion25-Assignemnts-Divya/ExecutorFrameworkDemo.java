import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Print implements Runnable{
	String name;
	
	public Print(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(name+" job started by Thread"+Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name+" job started by Thread"+Thread.currentThread().getName());
	}
	
}
public class ExecutorFrameworkDemo {
	public static void main(String[] args) {
		
		Print[] jobs = {
				 new Print("Browser"),
				new Print("MS Word"),
				new Print("MS Excel"),
				new Print("Adobe")
		};
		
		ExecutorService es = Executors.newFixedThreadPool(3);
		for (Print print : jobs) {
			es.submit(print);
		}
		es.shutdown();
	}
}
