package com.cg.application;

import com.cg.framework.CurrentAccount;

public class MMCurrentAccount extends CurrentAccount
{

	public MMCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return String.format("MMCurrentAccount [toString()=%s]", super.toString());
	}
	

}
