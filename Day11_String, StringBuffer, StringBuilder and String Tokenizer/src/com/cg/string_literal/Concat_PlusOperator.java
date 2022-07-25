package com.cg.string_literal;
//Program on Concat Operator/Method 
import java.util.Scanner;

public class Concat_PlusOperator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String str1=s.nextLine();
		System.out.println(str.concat(str1));
		s.close();
	}
}
