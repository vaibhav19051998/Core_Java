package com.cg.superkeyword;
//super keyword: it is used to invoke parent class constructor
class Flower
{
	Flower()
    {
		System.out.println("Flower");
	}	
}
class Rose extends Flower
{
	Rose()
	{
		
	//we are invoke parent class constructor

	super();
	System.out.println("Rose is Red");
	}
}

public class SuperConstructor {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Rose r=new Rose();
	}

}
