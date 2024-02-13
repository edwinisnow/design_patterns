package com.codewithmosh;

public class Account {
//	encapsulation: hiding the methods & props
	private float balance;
	
	public void deposit(float amount) {
		if(amount > 0 ) {
			this.balance += amount;
		}
	}
	public void withdraw(float amount) {
		if(amount > 0 ) {
			this.balance -= amount;
		}
	}
	public float getBalance() {
		return balance;
	}


}
