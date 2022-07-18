package com.cg.recursion;

import java.util.Scanner;

public class Factorial1 {
	
	static int factorial(int n)
    {
  	  if(n==1)
  		  return 1;
  	  else
  		  return n*factorial(n-1); // Recursion function
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(factorial(n)); // fun call
		s.close();
	}

}
