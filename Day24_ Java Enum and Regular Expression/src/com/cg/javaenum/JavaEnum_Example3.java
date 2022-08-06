package com.cg.javaenum;

interface Desktop
{
	void display();
}
enum Brand implements Desktop
{
	DELL,HP,ASSUS,LENOVA;
	
	@Override
	public void display()
	{
		System.out.println("Brand is : "+this);
	}
}

public class JavaEnum_Example3 {

	public static void main(String[] args) {
		Brand.ASSUS.display();
	}

}
