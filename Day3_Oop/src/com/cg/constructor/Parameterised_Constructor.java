package com.cg.constructor;

//Parameterised_Constructor
class B
{
	
	B(int n,String vehicle)
	{
		System.out.println(n);
		System.out.println(vehicle);
	}
}

public class Parameterised_Constructor {

	public static void main(String[] args) 
	{
		int n=8;
		String vehicle="CAR";
		@SuppressWarnings("unused")
		B a=new B(n,vehicle);
	}

}
