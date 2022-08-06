package com.cg.java.info;

import java.util.Scanner;

public class Robot_Problem {
	static int fun(int m, int n) 
	{
	    if (m == 1 || n == 1)
	        return 1;
	    else
	        return (fun(m - 1, n) + fun(m, n - 1));
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		//Using Scanner class
		Scanner s = new Scanner(System.in);
		 int m=s.nextInt();
		 int n=s.nextInt();
		
		 //int m = 2; //User input
	    //int n = 2;
	    System.out.println(fun(m, n));
	}

}
