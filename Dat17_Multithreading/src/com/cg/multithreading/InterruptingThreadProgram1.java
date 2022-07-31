package com.cg.multithreading;
//program on Interrupting_Thread Synchronization
//Using interrupt(), interrupted() and isInterrupted() Methods

class Bike extends Thread
{
	public void run()
	{
		try
		{
		Thread.sleep(1000);
		System.out.println("R15");
	}
	catch(InterruptedException e)
	{
		System.out.println("Exception handeled"+e);
	}
	System.out.println("Bike is Running ");
}
}
class Car1 extends Thread
{
	public void run()
	{
		try
		{
			Thread.sleep(500);
			System.out.println("KIA");
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception handeled "+e);
		}
		System.out.println("Car is Running ");
		}
	}
class vehicles extends Thread
{
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			System.out.println("Vehicles is "+i);
		}
	}
}


public class InterruptingThreadProgram1 
{
	public static void main(String[] args) throws InterruptedException
	{
		Bike B=new Bike();
		B.start();
		System.out.println("is thread interrupted "+B.isInterrupted());
		B.interrupt();
		
	}

}
