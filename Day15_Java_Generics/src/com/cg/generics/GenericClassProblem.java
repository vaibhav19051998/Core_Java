package com.cg.generics;

public class GenericClassProblem<T> {
	// T is a type
	T vai;
	public void display() 
	{
		
		System.out.println(vai.getClass().getName());
	}
	
	
	
	
	public static void main(String[] args) {
		GenericClassProblem<Integer>G=new GenericClassProblem<Integer>();//Generic Advantages
		G.vai=50;
		//G.vai='a';
		G.display();
	}

}
