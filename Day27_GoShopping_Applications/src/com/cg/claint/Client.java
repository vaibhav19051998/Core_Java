package com.cg.claint;

import com.cg.application.GSPrimeAcc;

import com.cg.application.GSNormalAcc;
import com.cg.application.GSShopFactory;
import com.cg.framework.NormalAccount;
import com.cg.framework.PrimeAccount;
import com.cg.framework.ShopFactory;

public class Client {
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		ShopFactory s=new GSShopFactory();
		PrimeAccount p=new GSPrimeAcc(3525,"Vaibhav Raut",500,true);
		NormalAccount n=new GSNormalAcc(1258,"Priyanka",650,50);
		//for Prime acc
		System.out.println("Prime Account: "); 
		p.bookProduct(p.getCharges());
		
		//for normal acc
		System.out.println("Normal Account: ");
		n.bookProduct(n.getCharges());
		System.out.println(p);
		System.out.println(n);
	}

	
}
