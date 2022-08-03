package com.cg.annotations;
//program on Custom Annotation
// Multi-Value Annotation has more than one method 

//Interface element is used to declare an annotation
@interface Customs
{
	// Abstract Method
	// Multi-Value Annotation
	String print() default "Vaibhav";
	int speed() default 50;
	float Millage() default 12.6f;
		
}
class Bus1
{
	@Customs (print="WE used Custom Annotation, speed=70,Millage=15.5f")
	public void print()
	{
		System.out.println("Bus is Running Fast");
	}
}
public class Program_CustomAnnotation {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		
		Bus1 b=new Bus1();
		b.print();
		
	}
}
