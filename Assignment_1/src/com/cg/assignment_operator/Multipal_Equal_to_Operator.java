package com.cg.assignment_operator;

import java.util.Scanner;

public class Multipal_Equal_to_Operator {

	public static void main(String[] args) {

		Scanner a1=new Scanner(System.in);
		int a=a1.nextInt();
		int b=a1.nextInt();
		a*=b;
		System.out.println(a);
		a1.close();
	}

}
