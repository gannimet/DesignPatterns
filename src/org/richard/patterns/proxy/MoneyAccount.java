package org.richard.patterns.proxy;

public class MoneyAccount implements Account {

	private double balance = 0.0;
	
	@Override
	public void deposit(double amount) {
		if(amount < 0) {
			System.out.println("Kann keinen negativen " +
				"Betrag einzahlen.");
			return;
		}
		
		balance += amount;
		System.out.println(amount + " erfolgreich eingezahlt.");
	}

	@Override
	public void withdraw(double amount) {
		if(balance < amount) {
			System.out.println("Zu geringes Guthaben. " +
				"Auszahlung verweigert.");
			return;
		}
		
		if(amount < 0) {
			System.out.println("Kann keinen negativen " +
				"Betrag auszahlen.");
			return;
		}
		
		balance -= amount;
		System.out.println(amount + " erfolgreich ausgezahlt.");
	}

	@Override
	public double getBalance() {
		return balance;
	}

}