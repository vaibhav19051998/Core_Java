package com.cg.framework;

public abstract class BankFactory 
{
	abstract public SavingAccount getNewSavingAccount(int accNo,String accNm,float accBal,boolean isSalaried);
	abstract public CurrentAccount getNewCurrentAccount(int accNo,String accNm,float accBal,float creditLimit);

}
