package com.cg.set;

import java.util.HashSet;
import java.util.Set;

public class SetProblem {

	public static void main(String[] args) {
		Set<Integer>obj=new HashSet<Integer>();
		//1. Set/HashSet is an unordered
		//2. Set does not allow duplicated values
		obj.add(15);
		obj.add(25);
		obj.add(50);
		obj.add(35);
		System.out.println(obj);
	}

}
