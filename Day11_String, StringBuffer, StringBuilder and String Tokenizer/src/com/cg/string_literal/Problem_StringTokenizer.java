package com.cg.string_literal;

import java.util.StringTokenizer;

public class Problem_StringTokenizer 
{

	public static void main(String[] args) {
		StringTokenizer st= new StringTokenizer("Lets try this");
		while(st.hasMoreTokens())
		System.out.println(st.nextToken());
		
	}

}
