package com.cg.string_literal;

import java.util.Scanner;

public class Program2UserInput {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		String str=s.nextLine();
		System.out.println(str);
		s.close();
	}

}
