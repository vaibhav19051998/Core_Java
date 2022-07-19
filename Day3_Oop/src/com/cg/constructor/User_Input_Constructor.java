package com.cg.constructor;
// User_Input_Constructor

class c
{
	int rollno;
	String name;
	c(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	void print()
	{
		System.out.println("Roll No is:"+rollno+"  and Name is:"+name);
	}
}
public class User_Input_Constructor {

	public static void main(String[] args) {
		c obj=new c(25,"Vaibhav");
		c obj1=new c(12,"Chetan");
		obj.print();
		obj1.print();

	}
	}

