package com.cg.generics;

import java.util.LinkedList;
import java.util.List;

public class GenericsProblem {

	public static void main(String[] args) {
		List<Integer>li=new LinkedList<Integer>();
		li.add(15);
		li.add(52);
		//1.Compile Time checking and type safe
		//li.add("A");
		System.out.println(li);
		//2. Type casting is not required in Generics
		
		List<String>obj=new LinkedList<String>();
		//List st=new LinkedList<String>();
		obj.add("Ram");
		obj.add("Sham");
		String str=obj.get(1);
		//type casting explicitly if there is not an object type
		//String str1=(String)obj.get(1);
		System.out.println(str);
	}

}
