package com.cg.logical_operator;

import java.util.Scanner;

public class Logical_OR_Operator {

	public static void main(String[] args) {

		Scanner a1=new Scanner(System.in);
		int a=a1.nextInt();
		int b=a1.nextInt();
		boolean result=(a<b || b>10);
		System.out.println(result);
		a1.close();
	}

}
