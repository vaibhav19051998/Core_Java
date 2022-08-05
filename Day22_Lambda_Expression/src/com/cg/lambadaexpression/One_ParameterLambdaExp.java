package com.cg.lambadaexpression;
//Program on Functional interface
interface Car
{
	int speed(int n);
}
public class One_ParameterLambdaExp {

	public static void main(String[] args) {
		
		//lambda Expression       
		Car c=(int n)->
		{
			return 70;
		};
		System.out.println("speed of the car is :" +c.speed(70) );
	}

}
