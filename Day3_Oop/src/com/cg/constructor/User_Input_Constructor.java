package com.cg.constructor;

import java.util.Scanner;

class C
{
	public
	String car,car1;
	int color,color1;
	
	C(String car, int color)
	{
		 car1= car;
		 color1=color;
	}
	void display()
	{
		 System.out.println( car+"  "+color1);
	}
}
public class User_Input_Constructor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Vehicle:");
		String car=s.nextLine();
		System.out.println("Enter Color:");
		int color=s.nextInt();
		C c1 = new C(car,color);
		c1.display();
		
		s.close();
	}

}
