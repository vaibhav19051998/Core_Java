package com.cg.framework; 

public abstract class ShopFactory 
{
	abstract public PrimeAccount getNewPrimeAccount(int accNo, String accNm,float charges,boolean isPrime);
	abstract public NormalAccount getNewNormalAccount(int accNo, String accNm,float charges,float delivaryCharges);
	
	}
	


