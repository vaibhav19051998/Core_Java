package co.cg.para;

import java.util.Scanner;

class C
{
	int Rollno;
	String name;
	C(int R,String N)
	{
		Rollno=R;
		name=N;
	}
	
	void print()
	{
		System.out.println("Rollno is "+Rollno+" and name is " +name);
	}
}
public class Example3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int Rollno=s.nextInt();
		String Name=s.nextLine();
		C obj=new C(Rollno,Name);
		C obj1=new C(Rollno,Name);
		obj.print();
		obj1.print();
		s.close();
	}

}
