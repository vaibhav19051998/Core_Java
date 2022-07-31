package com.cg.multithreading;
//Program on MultiThreading

public class ThreadClassProgram extends Thread
{
	public void run()
	{
		System.out.println("Thread is running");
	}
	
	public static void main(String[] args)
	{
		
		ThreadClassProgram T=new ThreadClassProgram();
		T.start();
	}

}
