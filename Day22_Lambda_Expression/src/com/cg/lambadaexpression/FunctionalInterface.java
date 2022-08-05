package com.cg.lambadaexpression;
//Functional interface
interface A
{
	//Zero-Parameter abstract method
	void show();
}
/*class B implements A
{

	@Override
	public void show() {
		System.out.println("program on Functional interface using lambada exp.");
	}
	
}*/

public class FunctionalInterface {

	public static void main(String[] args) {
		//B b=new B();
		//b.show();
		A obj=()->
		{
			System.out.println("program on Functional interface using lambada exp.");

		};
		obj.show();
	}

}
