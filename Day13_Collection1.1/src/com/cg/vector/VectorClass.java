package com.cg.vector;

import java.util.ArrayList;
import java.util.Vector;

public class VectorClass {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Vector v=new Vector();
		//Using one Variable
		v.add(11);
		v.add("vaibhav");
		v.add(50.2f);
		//Using two Variable
		v.add(0,"Priyanka");
		v.add(2, "Ram");
		v.add(3, "A");
		System.out.println(v);
		
		//copying all the elements of vector into ArrayList using addAll Methods
		ArrayList<Object> a=new ArrayList<Object>();
		a.addAll(v);
		System.out.println(a);
		//Clear elements using a.clear() methods
		a.clear();
		System.out.println(a);
	}

}
