  import java.lang.*;

class A
{
	public int i,j;
	public void fun()   //Defination
	{
		System.out.println("Base fun");
	}
	public void gun()    //Defination
	{
		System.out.println("Base gun");
	}
	public void sun()     //Defination
	{
		System.out.println("Base sun");
	}
}

class B extends A
{
	public int x,y;
	
	public void fun()    //overriding (in c++ Redefination)
	{
		System.out.println("Derrived fun");
	}
	public void sun()     //Overriding
	{
		System.out.println("Derrived sun");
	}
	public void run()    //Defination
	{
		System.out.println("Derrived run");
	}
}





public class Virtual 
{
public static void main(String args[])
{
	//Base bobj=new Base();    //No Casting
	//Derrived dobj=new Derrived();  ////No Casting
	
	
	A bobj1=new B();   //Upcasting  (Class base A reference to Derrived Class B)
	//Derrived dobj1=new Base(); //Downcasting
	bobj1.fun();
	bobj1.gun();
	bobj1.sun();
	//bobj1.run();
}
}
