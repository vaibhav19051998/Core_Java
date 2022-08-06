package com.cg.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Example2 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("Programming");
		Matcher m=p.matcher( "Java Programming is enough to get a job in it industry");
		while(m.find())
		{
			System.out.println("Pattern found from : "+m.start() + " to " + (m.end()-1));
		}
		System.out.println("Nothing");
	}

}
