import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable<Integer>{
	int num;
	public MyCallable(int num) {
		this.num = num;
	}
	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getName()+"is finding sum of first "+num+" numbers");
		int sum = 0;
		for (int i=1;i<=num;i++) {
			sum+=i;
			
		}
		return sum;
	}
	
}
public class CallableDemo {
	public static void main(String[] args) {
		MyCallable[] jobs = {
				new MyCallable(10),
				new MyCallable(20),
				new MyCallable(30),
				new MyCallable(40),
				new MyCallable(50),
				
		};
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		for (MyCallable myCallable : jobs) {
			Future<Integer> f = es.submit(myCallable);
			try {
			   System.out.println(f.get());	
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		es.shutdown();
	}
}
