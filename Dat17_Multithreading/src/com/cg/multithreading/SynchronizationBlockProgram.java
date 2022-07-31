package com.cg.multithreading;
// Program on Synchronization block

class object
{
	void printTable(int n)
	{
		synchronized(this) // Synchronized Block
		{
			for(int i=1;i<7;i++)
			{
				System.out.println(n*i);
				try
				{
					Thread.sleep(100);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}
		
	}// 
}
class Car extends Thread
{
	object O;
	Car(object O)
	{
		this.O=O;
	}
	public void run() 
	{
		O.printTable(10);
	}
}
class MyCar extends Thread
{
	object O;
	MyCar(object O)
	{
		this.O=O;
	}
	public void run()
	{
		O.printTable(50);
	}
}
public class SynchronizationBlockProgram {

	public static void main(String[] args) {
		
		object A=new object();
		Car C=new Car(A);
		MyCar C1=new MyCar(A);
		C.start();
		C1.start();
	}

}
