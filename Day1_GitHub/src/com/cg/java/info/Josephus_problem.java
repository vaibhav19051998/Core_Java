package com.cg.java.info;

public class Josephus_problem {
		static int fun(int n, int k) {
	        if (n==1)
	            return 1;
	        else
	            return (fun(n-1,k)+k-1)%n+1;
	    }

	    public static void main(String args[]) 
	    {
	        int n = 5;
	        int k = 2;
	        System.out.println(fun(n, k));
	    }
	}
