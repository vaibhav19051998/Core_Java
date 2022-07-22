package com.cg.wrapperclasses;
//converting primitive typed to the respective wrapper class class
public class Autoboxing {

	public static void main(String[] args) {
		float x=15.3f;//primitive type
		Float  a=x;//converting primitive to wrapper class
		Float f=new Float(10);
		System.out.println(x+" "+a+" "+f);
	}

}
