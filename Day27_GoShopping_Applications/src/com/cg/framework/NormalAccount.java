package com.cg.framework;

public abstract class NormalAccount extends ShopAccount
{
	private final float delivaryCharges;

	public NormalAccount(int accNo, String accNm, float charges,float delivaryCharges) {
		super(accNo, accNm, charges);
		this.delivaryCharges=delivaryCharges;
		
	}
	public void bookProduct(float charges)
	{
		System.out.println("Account No is:" +this.getAccNo()+"Account Name is:"+this.getAccNm()+
				"Charges is:"+(charges+delivaryCharges));
				
	}
	@Override
	public String toString() {
		return String.format("NormalAccount [delivaryCharges=%s]", delivaryCharges);
	}
	
	

}
