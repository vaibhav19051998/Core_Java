package com.cg.lambadaexpression;
//Program on lambda Expression in terms of Generic and Collections
import java.util.LinkedList;

public class Collection_GenericExp {

	public static void main(String[] args) {
		LinkedList<Integer>I=new LinkedList<>();
		I.add(15);
		I.add(52);
		I.add(62);
		System.out.println(I);
		//lambda Expression
		I.forEach((n)->
		{
			System.out.println(n);
		});
	}

}
