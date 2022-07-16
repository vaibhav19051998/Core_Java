package com.cg.variables;

import java.util.Scanner;

public class Char_Variable {

	public static void main(String[] args) {
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter The value of a:");
	 char a=s2.next().charAt(0);
		System.out.println(" The value of a:"+a);
	s2.close();
	}

}
