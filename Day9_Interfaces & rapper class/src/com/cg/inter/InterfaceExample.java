package com.cg.inter;

interface Bank
{
	void display();
}

interface Account extends Bank
{
	void print();
}

class SBI implements Account
{
	public void print()
	{
		System.out.println("Saving Account");
	}
	
	
	public void display()
	{
		System.out.println("State bank of india Account");
	}
}

public interface InterfaceExample {
	public static void main(String args[]) {
		SBI s=new SBI();
		s.display();
		s.print();
	}
		

}
