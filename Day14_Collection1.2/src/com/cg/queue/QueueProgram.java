package com.cg.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueProgram {
	//ArrayDeque Will print the element of a queue in same insertion order 
	public static void main(String[] args) {
		 Queue<Object> Q=new PriorityQueue<Object>();
		 Q.add(10);
		 Q.add(70);
		 Q.offer(15);
		 System.out.println(Q);
		 System.out.println(Q.peek());
		 //PriorityQueue will print the elements using priority of the elements
		 Queue<Object> Q1=new PriorityQueue<Object>();
		 Q1.add(550);
		 Q1.add(30);
		 Q1.offer(100);
		 System.out.println(Q1);
		 System.out.println(Q1.peek());
		 System.out.println(Q1.remove());
		 System.out.println(Q1);
		 System.out.println(Q1.poll());
		 System.out.println(Q1);
		 //if we use Remove method after our object is null, then remove method shows Exception    
		 System.out.println(Q1.remove());
		 System.out.println(Q1);
		 //if we use poll method after our object is null, then poll method it not shows Exception,it shows null  
		 System.out.println(Q1.poll());
		 System.out.println(Q1);
		
	}

}
