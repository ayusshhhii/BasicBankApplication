package bankapp;

public class Savings extends Account {
	//list properties specific to savings account
	private int safetyDepositId;
	private int safetyDepositKey;
	
	//constructor to initialize settings for savings account
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber= "1"+ accountNumber;
		setSafetyDepositBox();
	}
	
	@Override
	public void setRate() {
		rate= getBaseRate()- .25;
	}
	
	private void setSafetyDepositBox() {
		safetyDepositId= (int)(Math.random() * Math.pow(10, 3));
		safetyDepositKey= (int)(Math.random() * Math.pow(10, 4));
	}
	
	
	//list any methods specific to savings account
	public void showInfo() {
		
		super.showInfo();
		System.out.println("Your savings account features:"+
							"\n Safety Deposit Box Id: "+ safetyDepositId+
							"\n Safety Deposit Box Key: "+safetyDepositKey);
	}



}
