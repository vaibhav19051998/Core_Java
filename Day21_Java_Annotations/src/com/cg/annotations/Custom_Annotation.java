package com.cg.annotations;
// Program on custom Annotation
// it is define as @interface
@interface Custom
{
	// Abstract Method
	//Single value Annotation
	String print();
		
}
class Bus
{
	@Custom (print="WE used Custom Annotation")
	public void display()
	{
		System.out.println("class is Bus");
	}
}

public class Custom_Annotation {

	public static void main(String[] args) {
			Bus b=new Bus();
			b.display();
	}
}