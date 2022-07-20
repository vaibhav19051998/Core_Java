package com.cg.polymorphism;
//Program on Constructor Overloading

class Triber
{
	int speed;
	String engine;
	Triber()
	{
		System.out.println("Renault-Kiger");
		
	}
	
		Triber(int speed,String engine)
		{
			    this.speed=speed;
				this.engine=engine;
		System.out.println("speed  is :"+speed+ "km/hr" +" and the engine is on:"+engine);
		}
	}

public class MethodOverloading {

	public static void main(String[] args) 
	{
		
		@SuppressWarnings("unused")
		Triber t=new Triber();
		@SuppressWarnings("unused")
		Triber t1=new Triber(45,"Petrol");
	}

}
