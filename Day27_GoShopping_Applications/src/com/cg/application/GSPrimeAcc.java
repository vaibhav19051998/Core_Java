package com.cg.application;

import com.cg.framework.PrimeAccount;

public class GSPrimeAcc extends PrimeAccount {

	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return String.format("GSPrimeAcc [toString()=%s]", super.toString());
	}

}
