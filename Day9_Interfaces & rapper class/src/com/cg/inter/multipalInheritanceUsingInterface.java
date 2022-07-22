package com.cg.inter;
interface Mother
{
	void display();
}
interface Father
{
	void print();
}
class Daughter implements Mother,Father
{
	
	public void print() {
		System.out.println("My Father name is Ashok");
	}
	
	public void display() {
		System.out.println("My Mother name is Uma");
	}
}

public class multipalInheritanceUsingInterface {

	public static void main(String[] args) {
		Daughter d=new Daughter();
		d.display();
		d.print();
	}

}
