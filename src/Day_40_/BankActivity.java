package Day_40_;

public class BankActivity {

	public static void main(String[] args) {
		BankAccount acc1=new BankAccount();
		acc1.accountHolder="Mike";
		acc1.balance=0;
		
		acc1.showAccountHolder();
		acc1.showBalance();
		acc1.add100Dollar();
		acc1.showBalance();
		acc1.addDollar(225);
		acc1.showBalance();
		
		System.out.println("====================");
		
		BankAccount acc2=new BankAccount();
		acc2.accountHolder="John";
		acc2.balance=0;
		
		acc2.showAccountHolder();
		acc2.showBalance();
		acc2.add100Dollar();
		acc2.showBalance();
		acc2.addDollar(15);
		acc2.showBalance();

	}

}
