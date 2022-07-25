package com.cg.string_using_new_keyword;
// Program on String Using new keyword 
import java.util.Scanner;

public class Program02UserInput {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		String str=new String(s.nextLine());
		System.out.println(str);
		s.close();
	}

}
