package com.cg.bitwise_operator;

import java.util.Scanner;

public class Ternory_Operator {

	public static void main(String[] args) {
		Scanner a1=new Scanner(System.in);
		int a=a1.nextInt();
		int b=a1.nextInt();
		boolean result=(a%b==0)? true:false;
		System.out.println(result);
		a1.close();
	}

}
 