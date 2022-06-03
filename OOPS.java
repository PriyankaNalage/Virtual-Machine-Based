  import java.lang.*;
 class Demo
 {
	 public int i;
	 public int j;
	 public void fun()
	 {
		 System.out.println("Inside fun.");
	 }
	 public void gun()
	 {
		 System.out.println("Inside gun.");
	 }
     public Demo()
	 {
    	 this.i=0;
    	 this.j=0;
		 System.out.println("Inside Default constructor");
	
	 }
	 public Demo(int x,int y)
	 {
		 this.i=x;
		 this.j=y;
		 System.out.println("Inside Paramaterised constructor");
	
	 } 
 }
 class OOPS
 {
	 public   void main(String args[] )
	 {
		 System.out.println("Inside main.");
		Demo obj=new Demo();
	   obj.fun();
	   obj.gun();
	 System.out.println(obj.i);
	 Demo obj1=new Demo(11,10);
	   obj1.fun();
	   obj1.gun();
	 System.out.println(obj1.i);
	 
	 }
 
 }