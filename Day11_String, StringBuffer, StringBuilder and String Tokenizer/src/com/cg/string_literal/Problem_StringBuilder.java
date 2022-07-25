package com.cg.string_literal;

public class Problem_StringBuilder {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.capacity());
		sb.append("JAVA");
		System.out.println(sb.capacity());
		sb.append("Java is my fevorite language");
		System.out.println(sb.capacity());
	}
	

}
