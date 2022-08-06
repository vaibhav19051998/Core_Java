package com.cg.javaenum;

public class JavaEnum_Example1 
{
	enum Brand
	{
		Apple, Dell,HP,Assus;
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		int count=1;
		for(Brand b:Brand.values())
		{
			System.out.printf("Brand:%d=%s\n",count++,b);
		}
	}
}