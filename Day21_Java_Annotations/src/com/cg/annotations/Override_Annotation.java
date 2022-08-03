package com.cg.annotations;
//program on @Override Annotation

class Bike
{
	void speed(int a)
	{
		System.out.println("speed of Bike is : " +a+ "km/hr");
	}
}
class R15 extends Bike
{
	//@Override annotation is giving the extra information about the method
	@Override
	void speed(int str)
	{
		System.out.println("speed of R15 is : " +str+ "km/hr");
	}
}
public class Override_Annotation 
{
	public static void main(String args[])
	{
		R15 r=new R15();
		r.speed(70);
	}
}