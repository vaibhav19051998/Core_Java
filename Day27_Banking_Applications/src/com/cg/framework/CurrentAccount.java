package com.cg.framework;

public abstract class CurrentAccount extends BankAccount 
{
	
	private final float creditLimit;
	public CurrentAccount(int accNo, String accNm, float accBal,float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit=creditLimit;
	}
	public void withdraw (float accBal) 
	{
		System.out.println("Account No is: "+this.getAccNo()+"Account Name is: "+this.getAccNm()+
				"Account Balance is: "+(accBal+creditLimit));
	}
	@Override
	public String toString() {
		return String.format("CurrentAccount [creditLimit=%s]", creditLimit);
	}
	

	
	

}
