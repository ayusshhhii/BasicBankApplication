package bankapp;

public abstract class Account implements IBaseRate {
	//list common properties for savings and checking account
	private String name;
	private String sSN;
	private double balance;
	
	private static int index=10000;
	protected String accountNumber;
	protected double rate;
	
	
	//constructor to set basic properties and initialize the account
	public Account(String name, String sSN, double initDeposit) {		
		this.name=name;
		this.sSN=sSN;
		balance=initDeposit;
		
		//set account no.
		index++;
		this.accountNumber= setAccountNumber();
		setRate();
	}
	
	public abstract void setRate();
	
	public void compund() {
		double accruedInterest= balance*(rate/100);
		balance= balance+accruedInterest;
		System.out.println("Accrued Interest: $"+accruedInterest);
		pringBalance();
	}
	

	private String setAccountNumber() {
		String lastTwoOfSSN= sSN.substring(sSN.length()-2,sSN.length());
		int uniqueId= index;
		int randomNumber =(int) (Math.random()* Math.pow(10, 3));
		return lastTwoOfSSN + uniqueId + randomNumber;
	}
	
	//list common methods -transactions
	public void deposit(double amount) {
		balance= balance+amount;
		System.out.println("Depositing  $"+ amount);
		pringBalance();
	}
	
	public void withdraw(double amount) {
		balance= balance-amount;
		System.out.println("Withdrawing  $"+ amount);
		pringBalance();
	}
	
	public void transfer(String toWhere, double amount) {
		balance= balance-amount;
		System.out.println("Transferring $" +amount+" to "+toWhere);
		pringBalance();
	}
	
	public void pringBalance() {
		System.out.println("Now your balance is $"+balance);
	}
	
	public void showInfo() {
		System.out.println(
				"NAME: "+name+
				"\nACCOUNT NUMBER: "+accountNumber+
				"\nBALANCE: "+ balance+
				"\nRATE: "+rate+"$"
				);
		
	}

}
