package com.cg.lambadaexpression;

interface Desktop
{
	String display(String str1,String str2);
}

public class New_LambdaExpression {

	public static void main(String[] args) {
		//Desktop d=(String str1,String str2)->
		//{
		//	return str1+str2;
		//};
		
		//Using Lambda Expression
		Desktop d=(String a,String b)->(a+b);
		System.out.println("I have a two Desktop "+ d.display("Dell & " , "HP"));
	}

}
