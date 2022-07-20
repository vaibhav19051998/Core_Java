package com.cg.polymorphism;
//Program on Constructor Overriding

class multiplication
{
	void accept(int a, int b)
	{
		System.out.println(a*b);
	}
}
class mult extends multiplication
{
	void accept(int x, int y)
	{
		System.out.println(x*y);
	}
}


public class MethodOverriding {

	public static void main(String[] args) {
		mult m=new mult();
		m.accept(12, 5);
		multiplication m1=new multiplication();
		m1.accept(4,4);
	}

}
