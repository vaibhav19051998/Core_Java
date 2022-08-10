package com.cg.application;

import com.cg.framework.NormalAccount;

import com.cg.framework.PrimeAccount;
import com.cg.framework.ShopFactory;

public class GSShopFactory  extends ShopFactory 
{

	@Override
	public PrimeAccount getNewPrimeAccount(int AccNo, String accNm, float charges, boolean isPrime) {
		GSPrimeAcc p=new GSPrimeAcc(AccNo, accNm, charges, isPrime);
		return p;
	}

	public NormalAccount getNewNormalAccount(int AccNo, String accNm, float charges, float delivaryCharges) {
		GSNormalAcc n=new GSNormalAcc(AccNo, accNm, charges, delivaryCharges);
		return n;
	}

	
}


