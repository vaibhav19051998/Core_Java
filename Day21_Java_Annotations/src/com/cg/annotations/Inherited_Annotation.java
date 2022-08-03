package com.cg.annotations;
// Program on @inherited Annotation

import java.lang.annotation.*;
import java.lang.annotation.RetentionPolicy;
@Inherited
@Retention(RetentionPolicy.RUNTIME)

//The @interface element is used to declare an annotation.
@interface House
{
	String print();
	
		
}
@House(print = "Vaibhav")
class Flat
{
	public void display()
	{
		System.out.println("1BHK Flat ");
	}
}
class Builder extends Flat
{
	
	public void display1()
	{
		System.out.println("Builder have 1BHK Flat");
	}
}
public class Inherited_Annotation {
		
	public static void main(String[] args) {
		Builder o=new Builder();
		o.display();
		o.display1();
		
		
	}

}
