 import java.lang.*;
class Base
{
	public int i;
	public int j;
	
	public Base()
	{
		System.out.println("Inside the base constructor");
	}
	public void fun()
	{
		System.out.println("Inside base Fun");
		
	}
	public void fun(int x)        //function overloading
	{
		System.out.println("Inside base fun with integer argument");
	}
	 
	public void gun()
	{
		System.out.println("Inside base gun");
		
	}
	
}
class Derrived extends Base
{
	public int x;
	public int y;
	
	public Derrived()
	{
		System.out.println("Inside Derrived Constructor");
	}
	public void sun()
	{
	System.out.println("Inside Derrived sun");
	}
	
	
}
 class Inheritance1 
{
	 static 
	 {
		 System.out.println("Inside static block");
	 }

	public static void main(String[] args) 
	{
		System.out.println("Inside Main");
		 Derrived dobj=new Derrived();
		 dobj.fun();
		 dobj.fun(11);
		 dobj.gun();
		 
		dobj.sun();
		 
	}

}
