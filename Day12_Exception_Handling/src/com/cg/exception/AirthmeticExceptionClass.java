package com.cg.exception;

import java.util.Scanner;

public class AirthmeticExceptionClass {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		@SuppressWarnings("unused")
		int x=s.nextInt();
		int res=15/0;
		System.out.println(res);
		s.close();
	}
}
