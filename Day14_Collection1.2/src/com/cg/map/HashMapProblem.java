package com.cg.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapProblem {

	public static void main(String[] args) {
		Map<Integer,String>obj=new HashMap<Integer,String>();
		//HashMap is an unordered & LinkedHashMap is an ordered
		obj.put(7,"Vaibhav");
		obj.put(5, "Priyanka");
		obj.put(1, "Rohan");
		System.out.println(obj);
	}

}
