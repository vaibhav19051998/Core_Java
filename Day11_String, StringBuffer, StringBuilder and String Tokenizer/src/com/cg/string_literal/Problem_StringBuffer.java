package com.cg.string_literal;

public class Problem_StringBuffer
{

	public static void main(String[] args) 
	{
		String s="Good Morning";
		StringBuilder sb= new StringBuilder(s.length());
		System.out.println(sb.capacity());
	}
}