package com.cg.relational_operator;

import java.util.Scanner;

public class Greater_than_Operator {
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		{
			int a=s.nextInt();
			int b=s.nextInt();
			boolean result= a>b;
			System.out.println(result);
			s.close();
		}
	}

}
