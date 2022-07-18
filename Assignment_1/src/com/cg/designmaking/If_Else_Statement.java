package com.cg.designmaking;

import java.util.Scanner;

public class If_Else_Statement {
	

	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the age:");
	    int age = s.nextInt();
		System.out.println("Enter the weight:");
		int weight = s.nextInt();
	
		if(age<weight)
		{
			System.out.println("weight is Greater");
			
		}
		else
		{
			System.out.println("age is Greater");
			
		}
		s.close();
	}

}
