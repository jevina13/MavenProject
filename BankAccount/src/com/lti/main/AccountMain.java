package com.lti.main;

import java.util.Scanner;

import com.lti.model.displayAccount;

public class AccountMain {

	public static void main(String[] args) {
		System.out.println("1.Fill the details to create an account:");
		create();
	}

	private static void create() {
		int accNo = 0;
		double accBal = 0;
		String pass = "";
		String bank = "";
		double save = 0;
		double current = 0, withdr = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Bank Name\n1.Account Number\n2.Password\n3.Account Balance");
		bank = sc.next();
		accNo = sc.nextInt();
		pass = sc.next();
		accBal = sc.nextDouble();
		// AccountDetails acc = new AccountDetails(accNo, accBal, pass, bank);
		SavingsAccount sav = new SavingsAccount(accNo, accBal, pass, bank, accBal);
		CurrentAccount cur = new CurrentAccount(accNo, accBal, pass, bank, current);
		bank = sav.getBankName();
		accNo = sav.getAccountNo();
		pass = sav.getAccountPass();
		accBal = sav.getAccountBAl();
		save = sav.getMinimumBalance();
		current = cur.getOverdraftLimitAmount();
		displayAccount disp = new displayAccount();
		disp.display(accNo, accBal, pass, bank, save, current);
		if ((accBal > 500) || (accBal<5000) ) {
			System.out.println(accBal );
			System.out.println("\nEnter Ammount to be Withdrawn:");
			withdr = sc.nextDouble();
			sav.withdraw(withdr);
		}

	}

}
