package com.cg.javaenum;

public class JavaEnum_Example4 {
	
	enum EmployeeType
	{
		Contract,Permanent,Temporary;
	}
	static void print(EmployeeType e)
	{
		if(e==EmployeeType.Permanent)
		{
			System.out.println("Permanent Employee");
		}
		else if(e==EmployeeType.Contract)
		{
			System.out.println("Contract-Based Employee");
		}
		else
		{
			System.out.println("Temporary Employee");
		}
	}

	public static void main(String[] args) {
		EmployeeType e=EmployeeType.Permanent;
		print(e);
	}

}
