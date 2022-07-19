package com.cg.superkeyword;

//Super keyword is used to access parent class variable
class Bike
{
	protected String name="Yamaha";
}
 class Yamaha extends Bike
{
	String name ="R15";
	void display()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
}

public class SuperVariable {

	public static void main(String[] args )
	{
		
		Yamaha y=new Yamaha();
		y.display();
	}

}
