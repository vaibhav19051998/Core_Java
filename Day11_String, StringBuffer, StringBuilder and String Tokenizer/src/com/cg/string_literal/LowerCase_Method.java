package com.cg.string_literal;
// Program on Lower Case Method
import java.util.Scanner;

public class LowerCase_Method {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(str.toLowerCase());
		s.close();
	}

}