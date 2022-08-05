package com.cg.lambadaexpression;

interface Mobile
{
	int add(int a,int b);
}
public class New_Program {

	public static void main(String[] args) {
		Mobile m=(int a,int b)->(a*b);
		System.out.println("Mobile price of a & b is: "+m.add(10000, 12000));
	}

}
