package com.cg.string_literal;
//Program on input string Matching
import java.util.Scanner;

public class InputStringMatches {

	public static void main(String[] args) {
		String str="Dhoni";
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		if(str1.equals (str))
		{
			System.out.println("Matching");
		}
		else
		{
			System.out.println("Not Matching");
		}
		s.close();
	}

}
