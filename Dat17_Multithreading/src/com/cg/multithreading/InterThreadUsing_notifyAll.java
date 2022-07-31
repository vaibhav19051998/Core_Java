package com.cg.multithreading;
//Program on Inter_Thread Communication 
//Using notifyAll() 

class Audi extends Thread
{
	public void run()
	{
		synchronized(this)
		{
			System.out.println("Car is "+Thread.currentThread().getName());
			try
			{
				this.wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "notified...");
			
		}
		@SuppressWarnings("unused")
		class BMW extends Thread
		{
			Audi A;
			@SuppressWarnings("unused")
			BMW(Audi A)
			{
				this.A=A;
			}
			public void run()
			{
				synchronized(this.A)
				{
					System.out.println("Car is " +Thread.currentThread().getName());
					try
					{
						this.A.wait();
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "notified...");
				}
				@SuppressWarnings("unused")
				class Jaguar extends Thread
				{
					Audi A;
					@SuppressWarnings("unused")
					Jaguar(Audi A)
					{
						this.A=A;
					}
					public void run()
					{
						synchronized(this.A)
						{
							System.out.println("Car is " + Thread.currentThread().getName());
							// used notifyAll() method
							this.A.notifyAll();
							System.out.println(Thread.currentThread().getName() + "notified...");
						}
					}
				}
			}
		}
	}
}
public class InterThreadUsing_notifyAll {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException
	{
			Audi A=new Audi();
			Thread t1=new Thread(A ,"Thread-1");
			t1.start();
			Audi B=new Audi();
			Thread t2=new Thread(A ,"Thread-2");
			t2.start();
			Thread.sleep(1000);
			Audi J=new Audi();
			Thread t3=new Thread(A ,"Thread-3");
			t3.start();	
			
		}
		
		
	}

