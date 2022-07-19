package co.cg.para;

class B
{
	
	public int n;
	
	B(int n)
	{
		System.out.println("The value of a is:"+n);
		
	}
	
}
public class Example2 {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		B obj=new B(20);
	}

}
