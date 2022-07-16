package com.cg.java.info;

public class Robot_Problem {
	static int fun(int m, int n) 
	{
	    if (m == 1 || n == 1)
	        return 1;
	    else
	        return (fun(m - 1, n) + fun(m, n - 1));
	}
	public static void main(String[] args) 
	{
	    int m = 2;
	    int n = 2;
	    System.out.println(fun(m, n));
	}

}
