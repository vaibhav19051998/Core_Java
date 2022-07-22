package com.cg.wrapperclasses;

public class AutoboxingExample {

	public static void main(String[] args) {
		int A=50;//primitive type
		Integer  x=A;//converting primitive to wrapper class
		Integer y=new Integer(10);
		System.out.println(A+" "+x+" "+y);
	}

}
