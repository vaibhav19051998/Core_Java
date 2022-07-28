package com.cg.set;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		Set<Object> o=new LinkedHashSet<Object>();
		o.add("Vaibhav");
		o.add(5);
		o.add(9.0f);
		o.add(35);
		System.out.println(o);
		@SuppressWarnings("unused")
		Object[] arr=o.toArray();
		// if all the elements that we added heterogeneous then use Object type instead of int ,string
		for(Object itr:o)
		{
			System.out.println(itr);
		}
	}
	
}
