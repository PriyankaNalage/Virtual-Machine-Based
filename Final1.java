import java.lang.*;
class FinalDemo
{
	public int i;
	public final int j=20;
	public final int k;
	
	public FinalDemo()
	{
		this.i=10;
		this.k=30;
	}
	public FinalDemo(int a,int b)
	{
		this.i=a;
		this.k=b;
	}
	public void fun()
	{
		i++;
		//j++;                  NA
		//k++;                  NA
	}
}
public class Final {
public static void main(String args[])
{
	FinalDemo dobj1=new FinalDemo();
	dobj1.fun();

	FinalDemo dobj2=new FinalDemo(11,21);
	dobj2.fun();
}
}
