package com.lti.model;

public class displayAccount {

	public static void display(int accountNo, double accountBAl, String accountPass, String bankName) {
		System.out.println("Here are the details:\n" + bankName + " \n" + accountNo + " \n" + accountPass + "\n" + accountBAl);

	}

	public static void display(int accountNo, double accountBAl, String accountPass, String bankName, Double minimumBalance, double overdraftLimitAmount) {
		
		if (minimumBalance==0) {
			System.out.println("Here are the details:\n" + bankName + " \n" + accountNo + " \n" + accountPass);
		}
		else if(overdraftLimitAmount<=accountBAl) {
			System.out.println("Here are the details:\n" + bankName + " \n" + accountNo + " \n" + accountPass);
		}
		else {
		System.out.println("Here are the details:\n" + bankName + " \n" + accountNo + " \n" + accountPass + "\n" + accountBAl+"\nMinimum Balance: "+minimumBalance+"\nMaximum Balance: "+overdraftLimitAmount);
		}
	}
}
