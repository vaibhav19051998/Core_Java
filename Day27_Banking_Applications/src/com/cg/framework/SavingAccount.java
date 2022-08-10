package com.cg.framework;

public abstract class SavingAccount extends BankAccount 
{
	private boolean isSalaried;
	@SuppressWarnings("unused")
	static final private float MINBAL=5000;
	public SavingAccount( int accNo, String accNm, float accBal,boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried=isSalaried;
	}
	public void withdraw (float accBal)
	{
		System.out.println("Account No is: "+this.getAccNo()+"Account Name is: "+this.getAccNm()+
				"Account Balance is: "+accBal);
	}
	@Override
	public String toString() {
		return String.format("SavingAccount [isSalaried=%s]", isSalaried);
	}
	
	

	
	
	

}
