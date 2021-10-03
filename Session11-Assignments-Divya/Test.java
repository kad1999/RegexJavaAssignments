abstract class Bank{
	public abstract void openAccount();
	public abstract void closeAccount();
}

class SBI extends Bank{
	public void openAccount() {
		System.out.println("Open account");
	}
	public void closeAccount() {
		System.out.println("Close account");
	}
}


public class Test {
	public static void main(String[] args) {
		SBI sbi = new SBI();
		sbi.openAccount();
		sbi.closeAccount();
	}
}
