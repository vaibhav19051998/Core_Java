package com.cg.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListUsingMultipalDataType {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		
		@SuppressWarnings("rawtypes")
		ArrayList A=new ArrayList();
		A.add(10);
		A.add("Vaibhav");
		A.add(25.5);
		System.out.println(A);
		s.close();
	}

}
