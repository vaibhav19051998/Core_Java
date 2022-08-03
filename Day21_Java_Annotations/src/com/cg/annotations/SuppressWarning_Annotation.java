package com.cg.annotations;
//program on @SuppressWarning Annotation

class Bird
{
	Bird()
	{
		System.out.println("Sparrow");
	}

	public void sound()
	{
		System.out.println("Cheu-Cheu");
	}
}
public class SuppressWarning_Annotation {

	public static void main(String[] args) {
		
		//@suppressWarning are used to remove warning by complier
		@SuppressWarnings("unused")
		Bird B=new Bird();
		
	}

}