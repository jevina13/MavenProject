package com.lti.main;

public class CurrentAccount extends AccountDetails {
	private double overdraftLimitAmount;

	public CurrentAccount(int accountNo, double accountBAl, String accountPass, String bankName,
			double overdraftLimitAmount) {
		super(accountNo, accountBAl, accountPass, bankName);
		this.overdraftLimitAmount = overdraftLimitAmount;
	}

	public double getOverdraftLimitAmount() {
		overdraftLimitAmount=5000;
		if (super.getAccountBAl()>overdraftLimitAmount) {
			System.out.println("Limit Over Loaded!");
			return 0;
		}
		return overdraftLimitAmount;
	}

	public void setOverdraftLimitAmount(double overdraftLimitAmount) {
		this.overdraftLimitAmount = overdraftLimitAmount;
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		
	}
	
}
