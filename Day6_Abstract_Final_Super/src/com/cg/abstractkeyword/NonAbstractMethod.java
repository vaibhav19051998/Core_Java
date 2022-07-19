package com.cg.abstractkeyword;

abstract class Mother
{
	void print()
	{
		System.out.println("Non Abstract Method");
	}
}
class Son extends Mother
{
	
}


public class NonAbstractMethod {

	public static void main(String[] args) {
		Mother M=new Son();
		M.print();

	}

}
