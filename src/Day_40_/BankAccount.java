package Day_40_;

public class BankAccount {
	// 2 instance variables/fields
	String accountHolder;
	double balance;
	
	// creating an instance method(non static method)
	public void showAccountHolder(){
		System.out.println("Account Hlder name: "+accountHolder);
		
	}
	public void showBalance(){
		System.out.println("Show Account balance: " +balance);

}
	public void add100Dollar(){
		balance=balance+100;
}
	public void addDollar(int amount) {
		balance=balance+amount;
		
	}
}