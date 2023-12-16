package homework;

import javax.security.auth.login.AccountException;

public class Account {
	private double balance;
	
	public Account() {
	 balance = 0;
	 }
	
	public Account(double initialDeposit) {
	balance = initialDeposit;
	}
	
	public double getBalance() {
		return balance;
	}
	
	// returns new balance or -1 if error
	public double deposit(double amount) throws AccountException {
	       if (amount > 0) {
	           balance += amount;
	           return balance;
	       }
	       else
	           throw new AccountException("Error negative amount");
	   }

	// returns new balance or -1 if invalid amount
	public double withdraw(double amount) throws AccountException {
		if (amount < 0) {
			throw new AccountException("Error negative amount");
		}
		else if (amount > balance) {
			throw new AccountException("Not enough money");
		}
		else 
		   balance -= amount;
		   return balance;
	}
}
