package com.cg.multithreading;

public class Test extends Thread
{
	public void run()
	{
		System.out.println("Passed");
	}
	

	public static void main(String[] args)
	{
		Test create=new Test();
		create.start();
		//create.start();

	}

}
