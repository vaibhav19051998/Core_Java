package com.cg.inheritance;

class Bike {
	public int speed =50;
	//method
	void speed()
	{
		System.out.println("The speed of bike is:"+ speed+"km/hr");
	}
}
//inheritance
 class Pulser extends Bike{
	 
	 public int Speed = 70;
	 void average() {
		 System.out.println("Speed");
	 }
 }


public class SingleInheritance {

		public static void main(String[] args) {
			Pulser p = new Pulser();
			p.speed();
			p.average();

			}
	}

