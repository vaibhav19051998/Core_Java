package com.cg.relational_operator;

import java.util.Scanner;

public class Less_than_Operator {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		int b=s1.nextInt();
		boolean Result=(a<b);
		System.out.println(Result);
		s1.close();
	}

}
