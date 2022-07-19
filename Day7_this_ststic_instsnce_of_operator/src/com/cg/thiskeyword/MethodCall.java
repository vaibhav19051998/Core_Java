package com.cg.thiskeyword;
//3. this keyword can be passed as argument in method call
class B
{
	void print(B b)
	{
		System.out.println("Function 1 is invoked");
		
	}
	void display()
	{
		print(this);
	}
}
public class MethodCall {

	public static void main(String[] args) {
		B b=new B();
		b.display();
	}

}
