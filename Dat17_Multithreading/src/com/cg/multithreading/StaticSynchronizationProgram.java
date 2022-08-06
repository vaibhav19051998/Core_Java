package com.cg.multithreading;
//Program on Static Synchronization

class Test2
{
	public static synchronized void display()
	{
		System.out.println("Current Thread" + Thread.currentThread().getName());
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName() + "i- " +i);
			try
			{
				Thread.sleep(20);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	
	
	}

}
class value implements Runnable
{
	Thread t;
	Test2 val;
	value(Test2 val)
	{
		this.val=val;
		t=new Thread(this);
		t.start();
	}
	@SuppressWarnings("static-access")
	public void run()
	{
		val.display();
	}
}
public class StaticSynchronizationProgram {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Test2 A=new Test2();
		Test2 B=new Test2();
		value V1=new value(A);
		value V2=new value(B);
		
		
	}

}
