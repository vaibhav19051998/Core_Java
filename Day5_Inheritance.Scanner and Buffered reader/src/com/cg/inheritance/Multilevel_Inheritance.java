package com.cg.inheritance;

class Vehicle
{
	void carType()
	{
		System.out.println("Engine is on Petol");
	}
}
 class renault extends Vehicle
 {
	 public String brand = "Renult";
	 void brand()
	 {
		 System.out.println("Brand is:"+brand);
	 }
 }
 class KWID extends renault
 {
	 public int Speed=50;
	 void average()
	 {
		 System.out.println("The average speed is:"+Speed+"km/hr");
	 }
 }
public class Multilevel_Inheritance {

		public static void main(String[] args) {
			KWID k = new KWID();
			k.average();
			k.brand();
			k.carType();
			
		}
	}

