package com.lti.main;

public class SavingsAccount extends AccountDetails {
	
	private double minimumBalance;
	double amtAvail=0;
	
	public SavingsAccount(int accountNo, double accountBAl, String accountPass, String bankName,
			double minimumBalance) {
		super(accountNo, accountBAl, accountPass, bankName);
		this.minimumBalance = minimumBalance;
		amtAvail=accountBAl;
	}

	public double getMinimumBalance() {
		minimumBalance=1000;
		if (super.getAccountBAl()<=minimumBalance) {
			System.out.println("Minimum Balance 1000 required!");
			return 0;
		}
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	
	@Override
	public void withdraw(double amt) {
		double bal=0;
		if (amtAvail<amt) {
			System.out.println("Insufficient Balance");
		}
		else {
			amtAvail=amtAvail-amt;
			System.out.println("\nAvailable Balance:"+amtAvail);
		}
		
	}

	
	
}
