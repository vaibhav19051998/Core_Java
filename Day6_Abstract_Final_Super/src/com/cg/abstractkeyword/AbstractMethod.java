package com.cg.abstractkeyword;

abstract class Car
{
	abstract void display();
}
class Audi extends Car
{
	void display()
	{
		System.out.println("Audi is VIP Car");
		System.out.println("This is from Abstract method");

	}
}

public class AbstractMethod {

	public static void main(String[] args) {
		Car C=new Audi();
		C.display();

	}

}
