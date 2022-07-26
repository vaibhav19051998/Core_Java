package com.cg.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistUserInput {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		@SuppressWarnings("rawtypes")
		ArrayList A=new ArrayList();
		for(int i=0;i<=6;i++)
		{
			i=s.nextInt();
			A.add(i);
		}
		
			System.out.println(A);
			s.close();
	}
}
