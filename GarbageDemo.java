
class Gc
{
	public int Arr[];
	
	public Gc(int size)
	{
		System.out.println("Allocating the resources in constructor");
		this.Arr=new int[size];
	}
	protected void finalize()
	{
		System.out.println("Deallocating the resources in finalize");
		this.Arr=null;
		
	}
}


public class GarbageDemo {

	public static void main(String srgs[])
	{
		Gc gobj=new Gc(10);
		gobj=null;
		System.gc();
		System.out.println("End of main..");
	}
	
	
}
