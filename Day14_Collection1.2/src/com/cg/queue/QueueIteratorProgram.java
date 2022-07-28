package com.cg.queue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class QueueIteratorProgram {

	public static void main(String[] args) {
		Queue<Integer>q=new ArrayDeque<Integer>();
		for(int i=11;i<15;i++)
		{
			q.add(i);
		}
		System.out.println(q);
		boolean num=q.offer(50);
		System.out.println("IsAdded :"+num);
		System.out.println(q);
		//Iterator
		Iterator<Integer>itr=q.iterator();
		System.out.println("The Element are : ");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	

}
