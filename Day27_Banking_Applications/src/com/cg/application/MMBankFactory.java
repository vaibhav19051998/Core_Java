package com.cg.application;

import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAccount;
import com.cg.framework.SavingAccount;

public class MMBankFactory extends BankFactory
{

	@Override
	public SavingAccount getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalaried) {
		MMSavingAccount s=new MMSavingAccount(accNo, accNm, accBal, isSalaried);
		return s;
	}

	@Override
	public CurrentAccount getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAccount c=new MMCurrentAccount(accNo, accNm, creditLimit, creditLimit);
		return c;
	}
	

}
