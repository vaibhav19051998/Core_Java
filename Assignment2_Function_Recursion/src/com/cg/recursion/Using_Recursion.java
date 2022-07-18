package com.cg.recursion;

import java.util.Scanner;

public class Using_Recursion {
	
	 static int sumOfno(int n)
	   { 
	 	  if(n<=1)
	 		  return n;
	 	  return (n%10+sumOfno(n/10)); // logic
	   }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(sumOfno(n)); // fun call
		s.close();
	}

}
