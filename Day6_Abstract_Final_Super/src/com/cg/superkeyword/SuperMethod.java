package com.cg.superkeyword;

//Super keyword is used to access parent class method
class Animal
{
	public int a=10,b=20;
	void display()
	{
		System.out.println("Addition of no :"+(a+b));
	}
}
class Tiger extends Animal
{
	void display()
	{
		System.out.println("Tiger");
	}
	void print()
	{
		display();
		super.display();
	}
}

public class SuperMethod {

	public static void main(String[] args) {
		Tiger t=new Tiger();
		t.print();

	}

}
