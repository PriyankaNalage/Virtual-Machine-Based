import java.lang.*;
abstract class AbstractDemo
{
	public int i,j;
	public AbstractDemo()
	{
		System.out.println("Demo Constructor");
	}
	public void fun()   //concrete
	{
		System.out.println("Demo fun");
	}
	public abstract void gun();  //Abstract
	
}
class Hello extends AbstractDemo
{
	public int x,y;
	public  Hello()
	{
		System.out.println("Hello Constructor");
	}
	public void sun()
	{
		System.out.println("Hello sun");  //concrete
	}
	public void gun()
	{
		System.out.println("Hello gun");   //concrete(defination of abstract method)
		
	}
}



public class Abstract2 {

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
     
  
		 Hello hobj=new Hello();
		 hobj.fun();
		 hobj.gun();
		 hobj.sun();
	}

}
