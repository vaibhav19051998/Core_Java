package com.cg.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapProgram {

	public static void main(String[] args) {
		Map<String,String> t1=new TreeMap<String,String>();
		t1.put("Father", "Ashok");
		t1.put("Mother", "Uma");
		t1.put("Sister", "Vaishnavi");
		System.out.println(t1);
	}

}
