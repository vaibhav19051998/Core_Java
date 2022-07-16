package com.cg.relational_operator;

import java.util.Scanner;

public class Less_than_Equal_to_Operator {

	public static void main(String[] args) {
		Scanner s4=new Scanner(System.in);
		int a=s4.nextInt();
		int b=s4.nextInt();
		boolean Result=(a<=b);
		System.out.println(Result);
		s4.close();
	}

}
