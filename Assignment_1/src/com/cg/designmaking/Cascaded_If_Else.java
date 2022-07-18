package com.cg.designmaking;

public class Cascaded_If_Else {


	public static void main(String[] args) {
		int P1 = 45;
		int P2 = 69;
		int P3 = 75;
		if(P1<P2 && P2>P3)
		{
			System.out.println(P1);
		}
		else if(P2>P3 && P1<P3)
		{
			System.out.println(P2);
		}
		else
		{
			System.out.println(P3);
		}
				
	}
}
