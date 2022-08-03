package com.cg.annotations;
//Program on @deprecated Annotation
class Person
{
	//it allows any elements no longer to be used
	@Deprecated
	public void print()
	{
		System.out.println("There is a many Person");
	}
}

public class Deprecated_Annotation {

	public static void main(String[] args) {
		Person p=new Person();
		p.print();
		
		
		
	}

}
