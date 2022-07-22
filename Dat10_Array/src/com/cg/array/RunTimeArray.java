package com.cg.array;

import java.util.Scanner;

public class RunTimeArray {

	public static void main(String[] args) 
	{
	
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=s.nextInt();
		int A[]=new int[size];
		
				{
			System.out.println("Enter the value");
			
				}
		for(int i=0;i<A.length;i++)
		{
			System.out.println("Enter" + i+"Value");
			A[i]=s.nextInt();
		}
		
		for(int x:A)
		{
			System.out.println(x+" ");
		}
		s.close();
	}
	
}

