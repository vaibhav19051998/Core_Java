package com.cg.multithreading;
//Program on Inter_Thread Communication 
//Using wait() and notify() 

class ShopKepeer
{
	int value=50000;
	synchronized void cost(int value)
	{
		System.out.println("Spend value "  +value);
		if(this.value>value)
		{
			System.out.println("More value "   +value);
			try
			{
				wait();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			this.value=this.value-value;
			System.out.println("Process Completed "  +this.value);
		
		}
	}
		synchronized void paid(int value)
		{
			System.out.println("get value "+value);
			this.value=this.value+value;
			System.out.println("Completed"   +this.value);
			notify();
		}
	}

public class InterThreadUsing_wait_And_notify {

	public static void main(String[] args) {
		
		ShopKepeer s=new ShopKepeer();
		new Thread()
		{
			public void run()
			{
				s.cost(12000);
			}
		}.start();
		new Thread()
		{
			public void run()
			{
				s.paid(25000);
			}
		}.start();
		
	}

}
