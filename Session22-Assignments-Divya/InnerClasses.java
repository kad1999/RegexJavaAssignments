//outer
class Bank{
	//inner	
	class Account{
			public void accountInfo() {
				System.out.println("Balance"+5000);
				System.out.println("Loan"+100);
			}
		}
	
	void checkAccountInfo() {
		new Account().accountInfo();
	}
	class Loan{
		
	}
}
public class InnerClasses {
	public static void main(String[] args) {
		Bank b = new Bank();
		b.checkAccountInfo();
	}
}
