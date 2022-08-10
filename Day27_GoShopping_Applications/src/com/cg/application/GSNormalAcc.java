package com.cg.application;

import com.cg.framework.NormalAccount;

public class GSNormalAcc extends NormalAccount
{

	public GSNormalAcc(int accNo, String accNm, float charges, float delivaryCharges) {
		super(accNo, accNm, charges, delivaryCharges);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return String.format("GSNormalAcc [toString()=%s]", super.toString());
	}
	
	

	



}
