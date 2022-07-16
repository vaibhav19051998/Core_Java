package com.cg.relational_operator;

import java.util.Scanner;

public class Not_Equal_to_Operator {

	public static void main(String[] args) {
		Scanner s5=new Scanner(System.in );
		int a=s5.nextInt();
		int b=s5.nextInt();
		boolean result=(a!=b);
		System.out.println(result);
		s5.close();
	}

}
