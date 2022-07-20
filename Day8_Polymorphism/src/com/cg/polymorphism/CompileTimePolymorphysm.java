package com.cg.polymorphism;
class shape
{
	
	int area(int a)
	{
		return a*a;
	}
	int area(int a,int b)
	{
		return a*b;
	}
}

public class CompileTimePolymorphysm {
	
	public static void main(String args[])
	{
		shape s=new shape();
	    System.out.println(s.area(5));
	    System.out.println(s.area(10,20));
	}
}
