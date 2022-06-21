package com.cashapona.exceptionhandling.jun20;
/**
 * @author Anuradha
 */
class Amount{
	private String currency;
	private int amount;
	/**
	 * @param currency
	 * @param amount
	 */
	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Amount [currency=" + currency + ", amount=" + amount + "]";
	}
	public void add(Amount that) {
		if(!this.currency.equals(that.currency)) {
			throw new RuntimeException ("Currencies of " +this.currency+" & "+that.currency+" don't match, so we can't add amount");
		}
		this.amount=this.amount+that.amount;
	}
}
public class ThrowKeywordRunner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Amount amount1=new Amount("USD",1000);
		Amount amount2=new Amount("ERO",1000);
		Amount amount3=new Amount("ERO",1000);
		amount2.add(amount3);
		System.out.println(amount2);
		amount1.add(amount2);
		System.out.println(amount1);
	}
}
