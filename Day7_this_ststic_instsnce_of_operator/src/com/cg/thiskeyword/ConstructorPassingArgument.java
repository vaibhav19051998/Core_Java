package com.cg.thiskeyword;

class Arg
{
		int A,B;
  public void setdata(int A,int B)
  {
			this.A = A;			
			this.B = B;
  }

public void getdata()
{
	System.out.println("Value of A = "+A);
	System.out.println("Value of B = "+B);

}

}


public class ConstructorPassingArgument {

	public static void main(String[] args) {
		
		Arg obj = new Arg();
		obj.setdata(10,25);
		obj.getdata();
	}

}
