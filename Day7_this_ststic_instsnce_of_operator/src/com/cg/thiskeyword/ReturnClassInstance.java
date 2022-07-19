package com.cg.thiskeyword;

class Instance
{
	int a;
	 int Id(int a)
	{
		return this.a =a;
	}
}
public class ReturnClassInstance {

	public static void main(String[] args) {
		int a=20;
		Instance c=new Instance();
		System.out.println(c.Id(a));
	}

}
