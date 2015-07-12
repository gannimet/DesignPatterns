package org.richard.patterns.proxy;

public class Main {

	public static void main(String[] args) {
		Account account = new MoneyAccountProxy("abc");
		
		/* Vor jeder Transaktion werden wir nun
		 * nach dem Passwort gefragt */
		account.deposit(1500.0);
		account.withdraw(400.0);
		account.withdraw(2000.0);
		
		System.out.println("Neuer Kontostand: " + account.getBalance());
	}
	
}