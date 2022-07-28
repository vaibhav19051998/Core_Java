package com.cg.generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapGenericsProblem {

	public static void main(String[] args) {
		Map<Integer,String>is=new HashMap<Integer,String>();
		is.put(5,"Vaibhav");
		is.put(6,"Ram");
		is.put(4,"Priyanka");
		is.put(10,"Rohan");
		System.out.println(is);
		
		Set<Map.Entry<Integer,String>>itr=is.entrySet();
		
		Iterator<Map.Entry<Integer,String>>itr1=itr.iterator();
		
		while(itr1.hasNext())
		{
			//type casting is not required
			@SuppressWarnings("rawtypes")
			Map.Entry e=itr1.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
	
	
	}

}
