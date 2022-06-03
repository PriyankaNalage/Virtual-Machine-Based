 class Base
{
	public int i;
	public int j;
	
	public Base()
	{
		System.out.println("Inside the base constructor");
		this.i=10;
		this.j=20;
	}
	public Base(int a,int b)
	{
		this.i=a;
		this.j=b;
	}
	public void fun()
	{
		System.out.println("Inside base Fun");
		
	}
	
	 
}
class Derrived extends Base
{
	public int x;
	public int y;
	
	public Derrived()
	{
                super(11,22);
		System.out.println("Inside Derrived Constructor");
		this.x=30;
		this.y=20;
		
	}
	public void sun()
	{
	 
	System.out.println("Inside Derrived sun");
	System.out.println(super.i);  //1 Super keyword use for characteristics of base class
	super.fun();                //2   Super keyword use for behaviour of base class
	}
	
	
}
 class Super 
{
	 

	public static void main(String[] args) 
	{
		System.out.println("Inside Main");
		 Derrived dobj=new Derrived();
		 
	    dobj.sun();
		 
	}

}
