package com.cg.exception;
//Program to handle the Exception by using try & catch block
public class ArrayIndexoutOfBoundException {

	public static void main(String[] args) 
	{
		System.out.println("First line");
        System.out.println("Second line");
        int[] myIntArray = new int[]{1, 2, 3};
       try 
       {
        print(myIntArray);
        System.out.println("Third line");
       	}
       catch(Exception e)
       {
    	   System.out.println(e);
       }
    } 
		public static void print(int[] arr)
		{
        System.out.println(arr[3]);
        System.out.println("Fourth element successfully displayed!");
		}
	
	}


