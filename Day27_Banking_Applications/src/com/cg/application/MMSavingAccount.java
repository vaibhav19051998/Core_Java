package com.cg.application;

import com.cg.framework.SavingAccount;

public class MMSavingAccount extends SavingAccount 
{

	public MMSavingAccount(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return String.format("MMSavingAccount [toString()=%s]", super.toString());
	}
	

}
