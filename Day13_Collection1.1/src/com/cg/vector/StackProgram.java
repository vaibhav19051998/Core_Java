package com.cg.vector;

import java.util.Stack;

public class StackProgram {

	public static void main(String[] args)
	{
		Stack<Object> s=new Stack<Object>();
		s.add(11);
		s.push(11);
		s.push(12);
		s.push("vaibhav");
		System.out.println(s);
		System.out.println(s.pop());
	}

}
