package com.cg.annotations;
//program on custom annotation

import java.lang.annotation.ElementType;
import java.lang.annotation.*;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)


@interface Owner
{
	//Single value Annotation
	int accept();
}

class Banglow
{
	@Owner(accept=52)
	public static void display() 
	{
		System.out.println("Owner of Banglow is Rich");
	}
}
public class Cust_Annotation {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException 
	{
		Banglow b=new Banglow();
		Method m=b.getClass().getMethod("display");
		Owner O=m.getAnnotation(Owner.class);
		System.out.println(O.accept());
		Banglow.display();
	}

}