package org.richard.patterns.proxy;

import java.util.Scanner;

public class MoneyAccountProxy implements Account {

	private String password;
	private MoneyAccount account;
	
	private Scanner scanner = new Scanner(System.in);
	
	public MoneyAccountProxy(String password) {
		this.password = password;
		account = new MoneyAccount();
	}

	@Override
	public void deposit(double amount) {
		if(isLegalAccess())
			account.deposit(amount);
		else
			System.out.println("Zugriff verweigert.");
	}

	@Override
	public void withdraw(double amount) {
		if(isLegalAccess())
			account.withdraw(amount);
		else
			System.out.println("Zugriff verweigert.");
	}
	
	private boolean isLegalAccess() {
		System.out.print("Passwort eingeben: ");
		String entered = scanner.nextLine();
		
		return entered.equals(password);
	}

	@Override
	public double getBalance() {
		return account.getBalance();
	}

}