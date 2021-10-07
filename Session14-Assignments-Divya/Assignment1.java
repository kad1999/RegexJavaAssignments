class RedSignalThread extends Thread{
	public void run() {
		
		System.out.println("Red Signal");
	}
}

class YellowSignalThread extends Thread{
	public void run() {
		System.out.println("Yellow signal");
	}
}
class GreenSignalThread extends Thread{
	public void run() {
		System.out.println("Green signal");
	}
}


public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		RedSignalThread red = new RedSignalThread();
		YellowSignalThread yellow = new YellowSignalThread();
		GreenSignalThread green = new GreenSignalThread();
		
		red.start();
		red.join();
		
		yellow.start();
		yellow.join();
		
		green.start();
	}
}
