package com.cg.map;

import java.util.HashMap;
import java.util.Map;

public class MapRemoveProgram {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Map<Character,String> map=new HashMap<Character,String>();
		map.put('A',"Vaibhav");
		map.put('B',"Priyanka");
		map.put('C',"Rohan");
		map.put('D',"Chetan");
		map.put('E',"Shiwani");
		System.out.println(map);
		map.remove('b');
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
