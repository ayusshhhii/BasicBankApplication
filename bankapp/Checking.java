package bankapp;

public class Checking extends Account {
	//list the properties specific to checking account
	private int debitCardNum;
	private int debitCardPin;
	
	
	//constructor to initialize the checking account properties
	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber= "2"+ accountNumber;
		setDebitCard();
		}
	@Override
	public void setRate() {
		rate= getBaseRate()* .15;
	}
	
	//list any methods specific to the checking account
	private void setDebitCard() {
		debitCardNum= (int)(Math.random()*Math.pow(10, 12));
		debitCardPin= (int)(Math.random()*Math.pow(10, 4));
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Your checking account features:"
				+ "\n Debit Card Number: "+debitCardNum+
				"\n Debit Card Pin: "+debitCardPin+
				"\n Rate "+rate+"%");
	}

	
	

}
