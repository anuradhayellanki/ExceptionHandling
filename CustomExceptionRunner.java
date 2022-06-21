package com.cashapona.exceptionhandling.jun20;

import javax.naming.InsufficientResourcesException;

/**
 * @author Anuradha
 * CheckingAccount class contains a withdraw () that throws InsufficientFundException
 */
class CheckingAccount{
	double balance;
	/**
	 * @return the balance
	 */
	double getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double amount) {
		balance+=amount;
	}
	public void withdraw(double amount) throws InsufficientResourcesException{
		if(amount<=balance) {
			balance-=amount;
		}else {
			//double needs=amount-balance;
			throw new InsufficientResourcesException();
		}
	}
}
public class CustomExceptionRunner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CheckingAccount check=new CheckingAccount();
		check.setBalance(500);
		System.out.println("Doposit 500/- ");
		check.deposit(500);
		try{
			System.out.println("Withdraw 100/- ");
			check.withdraw(100);
			System.out.println(check.getBalance());
			System.out.println("Withdraw 1000/- ");
			check.withdraw(1000);
			System.out.println(check.getBalance());

		}catch(InsufficientResourcesException e) {
			System.out.println("Sorry ! , you have balance : "+check.getBalance());
			e.printStackTrace();
		}
		
		
	}

}
