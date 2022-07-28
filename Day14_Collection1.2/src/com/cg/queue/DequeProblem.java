package com.cg.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeProblem {

	public static void main(String[] args) {
		 Deque<Object> d=new ArrayDeque<Object>();
		 d.add(15);
		 //Adding the elements on front end
		 d.addFirst(16);
		 //Adding the elements on rear(back) end
		 d.addLast(85);
		 d.add("Vaibhav");
		 d.add("shiwani");
		 System.out.println(d);
		 //Removing the Elements from front & Rear end
		 d.removeFirst();
		 d.removeLast();
		 System.out.println(d);
	}

}
