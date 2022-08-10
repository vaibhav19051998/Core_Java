package com.cg.framework;

public abstract class ShopAccount 
{
	private int accNo;
	private String accNm;
	private float charges;
	//constructor
	public ShopAccount(int accNo, String accNm, float charges) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}
	//getters and setter method for private variable
	public int getAccNo() {
		return accNo;
	}
	//abstract method bookProduct
	abstract public void bookProduct(float charges);
	public void items (float charges)
	{
		System.out.println(charges);
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public float getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		this.charges = charges;
	}
	//to string methods
	@Override
	public String toString() {
		return String.format("ShopAccount [accNo=%s, accNm=%s, charges=%s]", accNo, accNm, charges);
		
		
		
	}
	

}
