package com.cg.statickeyword;

public class StaticBlock {
	static int num;
	static String str;
	
	static
	{
		num=20;
		str="Vaibhav";
	}
	/*StaticBlock()
	{
		num=20;
		str="Vaibhav";
	}*/
	
	public static void main(String[] args) {
		//StaticBlock s=new StaticBlock();
		//System.out.println(s.num);
		//System.out.println(s.str);
	
		System.out.println(num);
		System.out.println(str);
	}

}
