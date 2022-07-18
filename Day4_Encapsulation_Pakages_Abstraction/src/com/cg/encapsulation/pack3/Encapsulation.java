package com.cg.encapsulation.pack3;

import com.cg.encap.pack3.HDFC;

public class Encapsulation {

	public static void main(String[] args) {
		
		HDFC h =new HDFC();
		h.setATM_PIN(2524);
		{
	
	      	System.out.println("The ATM PIN is: " + h.getATM_PIN());
	     }
    
	}
}
