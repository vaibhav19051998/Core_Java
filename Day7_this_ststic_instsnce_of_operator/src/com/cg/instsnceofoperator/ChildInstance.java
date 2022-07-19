package com.cg.instsnceofoperator;

class A
{
	
}
public class ChildInstance  extends A{

	public static void main(String[] args) {
		
		ChildInstance c=new ChildInstance();
		// c is the obj of parent class "A" because "ChildInstsnce" class 
		System.out.println(c instanceof A);
	}

}
