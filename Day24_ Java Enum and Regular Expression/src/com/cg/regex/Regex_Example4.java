package com.cg.regex;

import java.util.Scanner;

public class Regex_Example4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str="M-21 -- Vaibhav Raut--Ram";
		String[] res=str.split("--");
		for(String i:res)
		{
			System.out.println(i);
		}
		s.close();
		
	}

}
