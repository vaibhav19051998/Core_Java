package com.cg.map;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapProblem {

	public static void main(String[] args) {
		Map<Integer,String>obj=new LinkedHashMap<Integer,String>();
		//HashMap is an unordered & LinkedHashMap is an ordered
		obj.put(7,"Vaibhav");
		obj.put(5, "Priyanka");
		obj.put(1, "Rohan");
		System.out.println(obj);
		System.out.println(obj.get(5));
	}

}