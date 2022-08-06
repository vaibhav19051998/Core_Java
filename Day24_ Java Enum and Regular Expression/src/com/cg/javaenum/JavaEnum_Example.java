package com.cg.javaenum;

enum Bike
{
	R15,FZS,Pulser;
}
public class JavaEnum_Example {

	public static void main(String[] args) {
		Bike b=Bike.FZS;
		System.out.println("My Fevorite Bike is "+b);
	}

}
