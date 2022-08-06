package com.cg.javaenum;

enum House
{
	Banglo,RowHouse,FarmHouse,Flat,Zopdi
}

public class JavaEnum_Example2 {

	public static void main(String[] args) {
		House h=House.Zopdi;
		switch(h)
		{
		case Banglo:
			System.out.println("I like Banglo");
			break;
		case RowHouse:
			System.out.println("I like RowHouse");
			break;
		case FarmHouse:
			System.out.println("I like FarmHouse");
			break;
		case Flat:
			System.out.println("I like Flat");
			break;
			
		default:
			System.out.println("Invalid Name");
		}
	}

}
