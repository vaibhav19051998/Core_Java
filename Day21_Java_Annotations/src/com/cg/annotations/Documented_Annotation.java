package com.cg.annotations;
//Program on @Documented Annotation
import java.lang.annotation.Documented;
import java.lang.annotation.*;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@interface Car
{
	String print();
	
		
}
class Audi
{
	@Car(print="Vaibhav")
	public void display()
	{
		System.out.println("Audi is a VIP Car");
	}
}

public class Documented_Annotation {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Audi a=new Audi();
		a.display();
		Method m=a.getClass().getMethod("display");
		Car c=m.getAnnotation(Car.class);
		System.out.println(c.print());
	}

}
