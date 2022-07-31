package com.cg.multithreading;
//program on Mutual Exclusive Synchronization
class Test1
{
	synchronized void printTable(int n) //synchronized method
	{
		for(int i=1;i<=6;i++)
		{
			System.out.println(n*2);
			try
			{
				Thread.sleep(400);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}

}


class Thread1 extends Thread
{
	Test1 t;
	Thread1(Test1 t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
	}
}

class Thread2 extends Thread
{
	Test1 t;
	Thread2(Test1 t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(50);
	}
}

public class MutualExclusiveProgram {

	public static void main(String[] args)
	{
		Test1 A=new Test1();
		Thread1 t1=new Thread1(A);
		Thread2 t2=new Thread2(A);
		t1.start();
		t2.start();
	}

}
