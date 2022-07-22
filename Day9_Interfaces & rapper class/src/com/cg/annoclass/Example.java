package com.cg.annoclass;
//Annonymus class 

abstract class Bike
{
	public abstract void  Speed();
	
}

public class Example 
{

	public static void main(String[] args) 
	{
		Bike b=new Bike()
		{
				public void Speed()
				{
					System.out.println("Display the speed of the Bike");
				}
		};
		b.Speed();
		
	}

}
