package com.cg.array;
//Non primitive Array Example
class Worker
{
	public int Emp_Id;
	public String Name;
	//Constructor is used to initialize value
	Worker(int id,String name)
	{
		Emp_Id=id;
		Name=name;
	}
}

public class NonPrimitiveArray {

	public static void main(String[] args) {
		
		Worker arr[]=new Worker[2];
		arr[0]=new Worker(121,"Vaibhav");
		arr[1]=new Worker(122,"Rohan");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Worker at " +i+" th"+" index is "+arr[i].Name);
		}
	}

}
