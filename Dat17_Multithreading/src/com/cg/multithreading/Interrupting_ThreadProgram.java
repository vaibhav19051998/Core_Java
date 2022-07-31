package com.cg.multithreading;
//program on Interrupting_Thread Synchronization
//Using interrupt(), interrupted() and isInterrupted() Methods

class A extends Thread
{
	public void run()
	{
		System.out.println("I love Coding");
	}
}

public class Interrupting_ThreadProgram {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		A t=new A();
		t.start();
		t.interrupt();
		//System.out.println("is Thread Interrupted  "   +t.isInterrupted());
		//t.interrupted();
		//System.out.println("is Thread Interrupted  "   +t.interrupted());
		
		
	}

}
