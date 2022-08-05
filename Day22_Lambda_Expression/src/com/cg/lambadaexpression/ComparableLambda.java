package com.cg.lambadaexpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparableLambda {

	public static void main(String[] args) {
		Comparator<String>c=(S1,S2)->Integer.compare(S1.length(),S2.length());
		String A[]= {"Vaibhav","Priyanka","Chetan"};
		Collections.sort(Arrays.asList(A),c);
		for(String n:A)
		{
			System.out.println(n);
		}
		
		
	}

}
