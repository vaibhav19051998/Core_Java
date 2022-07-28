package com.cg.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetProgram {

	public static void main(String[] args) {
		Set<Integer>obj=new LinkedHashSet<Integer>();
		//1. LinkedHashSet is an ordered
		//2. Set does not allow duplicated values
		obj.add(15);
		obj.add(25);
		obj.add(50);
		obj.add(null);
		
		System.out.println(obj);
	}
		
}

