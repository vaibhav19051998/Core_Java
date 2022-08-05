package com.cg.lambadaexpression;


interface Racing
{
	String print(String str, int a  );
}
public class Two_ParameterLambdaExp {

	public static void main(String[] args) {
		Racing r=(String str, int a)->
		{
			return str+a;
	
		};
		System.out.println(r.print("Running compitation is ", 1000)+"Meter");
		
		
	}

}
