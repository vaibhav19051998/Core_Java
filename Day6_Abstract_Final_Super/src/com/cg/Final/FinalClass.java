package com.cg.Final;

class FinalMethod
{
	void accept()
	{
		System.out.println("Accept Method from Final Class");
	}
}
class Child extends FinalMethod
{
	final void accept()
	{
		System.out.println("Hello Everyone");
	}
}
public class FinalClass {

	public static void main(String[] args) {
		Child D=new Child();
		D.accept();
	}

}
