package com.cg.inheritance;

class Animal
{
	void Name()
	{
		System.out.println("Animal name is Lion");
	}	
}
class Dog extends Animal
{
	void Name1()
	{
		System.out.println(" Pet Animal ");
	}
}
class Tiger extends Animal
{
	void Name2()
	{
		System.out.println(" Wild Animal ");
	}
}
/*class cat extends Animal
{
	void Name3()
	{
		System.out.println(" Cat name is rani ");
	}
}*/

public class HierarchicalIheritance {

	public static void main(String[] args) {
		Tiger A = new Tiger();
		A.Name();
		A.Name2();
		//A.Name3();
		Dog A1 = new Dog();
		A1.Name1();
	}

}
