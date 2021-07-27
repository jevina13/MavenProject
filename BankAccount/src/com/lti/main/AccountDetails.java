package com.lti.main;

abstract class AccountDetails {
	private int accountNo;
	private double accountBAl;
	private String accountPass;
	public String bankName;
	public abstract void withdraw(double amount);
	

	public AccountDetails() {
		super();
	}
	

		

	public AccountDetails(int accountNo, double accountBAl, String accountPass, String bankName) {
		super();
		this.accountNo = accountNo;
		this.accountBAl = accountBAl;
		this.accountPass = accountPass;
		this.bankName = bankName;
	}

	public int getAccountNo() {
		//System.out.println("InsideGetAccNO");
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public double getAccountBAl() {
		return accountBAl;
	}

	public void setAccountBAl(double accountBAl) {
		this.accountBAl = accountBAl;
	}

	public String getAccountPass() {
		return accountPass;
	}

	public void setAccountPass(String accountPass) {
		this.accountPass = accountPass;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

}
