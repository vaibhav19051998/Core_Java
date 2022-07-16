package com.cg.relational_operator;

import java.util.Scanner;

public class Greater_than_Equal_to_Operator {

	public static void main(String[] args) {
		Scanner s3=new Scanner(System.in);
		int a=s3.nextInt();
		int b=s3.nextInt();
		boolean Result=(a>=b);
		System.out.println(Result);
		s3.close();
	}

}
