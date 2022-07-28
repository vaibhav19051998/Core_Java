package com.cg.generics;

public class GenericMethodProgram {

	public static void main(String[] args) 
	{
		
		Integer arr[]= {100,200,500};
		Character ch[]= {'V','P','R'};
		
		System.out.println("Integer Array: ");
		print(arr);
		
		System.out.println("Character Array: ");
		print(ch);
	}
		
	
	     //Generic Method
		//E is a Element
		public static <E>void print(E[] elements)
		{
			for(E elem: elements)
			{
				System.out.println(elem);
			}
			System.out.println();
		}
}

