package com.cg.multithreading;
//program on Thread Synchronization 
class Counter
{
	int count;
	public synchronized void increment()//Synchronized method
	{
		count++;
	}
}

public class ThreadSynchronizationProgram 
{

	public static void main(String[] args) 
			throws InterruptedException {
		
		Counter c=new Counter();
		Thread t1=new Thread(new Runnable() 
		{
			public void run()
			{
				for(int i=1;i<=500;i++)
				{
					c.increment();
				}
			}
		});
		
		Thread t2=new Thread(new Runnable()
				{
			public void run()
			{
				for(int i=1;i<=500;i++)
				{
					c.increment();
				}
			}
		});
		t1.start();
		t2.start();
		// join() is used to joined 2 Threads 
		t1.join();
		t2.join();
		System.out.println(c.count);
	
	}

}
