package com.cg.map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapProgram {

	public static void main(String[] args) {
		NavigableMap<Integer,String> n=new TreeMap<Integer,String>();
		n.put(10, "Ram");
		n.put(20, "lakshman");
		n.put(30, "sita");
		n.put(40, "sham");
		System.out.println(n);
		System.out.println(n.firstEntry());
		System.out.println(n.lastEntry());
		System.out.println(n.lastKey());
		System.out.println(n.firstKey());
		
	}

}
