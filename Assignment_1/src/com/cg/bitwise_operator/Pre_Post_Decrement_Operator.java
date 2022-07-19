package com.cg.bitwise_operator;

import java.util.Scanner;

public class Pre_Post_Decrement_Operator {
	
		public static void main(String[] args) {
			
			Scanner a1=new Scanner(System.in);
			int a=a1.nextInt();
			int b=a1.nextInt();

			int x=a--;
			@SuppressWarnings("unused")
			int y=--b;
			int result=x+a;
			System.out.println(result);
			a1.close();

	}

}
