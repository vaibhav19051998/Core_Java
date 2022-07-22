package com.cg.inter;

interface Vehicle
{
	void speed();
}

interface Car extends Vehicle
{
	void engine();
}

class Bus implements Car
{
	public void engine()
	{
		System.out.println("Petrol");
	}
	
	public void speed()
	{
		System.out.println("Speed is 50 kmph");
	}

	public void Speed() {
		System.out.println("Speed is 50 kmph");		
	}
}
public class Main {

	public static void main(String[] args) {
		Bus b=new Bus();
		b.engine();
		b.Speed();
	}

}
