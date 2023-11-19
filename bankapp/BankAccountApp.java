package bankapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
	
	public static void main(String[] args) {
		
		List<Account> accounts= new LinkedList<Account>();
		
		
		/*intial testing
		----------------
		Checking check= new Checking("Tom Wilson", "312435464", 1500);
		
		Savings saving= new Savings("Rich Lowe", "465768354", 2500);
		
		
		saving.showInfo();
		System.out.println("**********");
		check.showInfo();*/
		
		
		//read a CSV file then create a new account based on that data
		
		String file= "C:/JavaProj_Nov/BankApplication/src/utilities/accountdata.txt";
		
		
		List<String[]> newAccountHolder= utilities.CSV.read(file);
		for(String[] accountHolder: newAccountHolder) {
			String name= accountHolder[0];
			String sSN= accountHolder[1];
			String accountType= accountHolder[2];
			double initDeposit= Double.parseDouble(accountHolder[3]);
			if(accountType.equals("Savings")) {
				accounts.add(new Savings(name, sSN, initDeposit));
			}
			else if(accountType.equals("Checking")) {
				accounts.add(new Checking(name, sSN, initDeposit));
			}
			else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
		}
		
		for(Account acc: accounts) {
			System.out.println("\n***************************");
			acc.showInfo();
		}
	}

}
