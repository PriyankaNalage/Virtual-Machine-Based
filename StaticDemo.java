  import java.lang.*;
 class Demo
 {
	 public int i;
	 public int j;
	 public static int k;    //static characteristics
	 
	 static
	 {
		 System.out.println("Inside static block");
		 k=11;
	 }
	 
	 public Demo()
	 {
		 this.i=0;
		 this.j=0;
		 System.out.println("Inside Default Costructor");
	 }
	 public void fun()
	 {
		 System.out.println("Inside non-static fun");
		 System.out.println(this.i);
		 System.out.println(this.j);
		 System.out.println(this.k);  //non static call static and non-static 
	 }
	 public static void gun()    //static Behaviours
	 {
		 System.out.println("Inside static gun");
		 System.out.println(k); //static call only static 
	 }
 }
 class StaticDemo
 {
	 public static void main(String args[])
	 {
		 Demo.gun();    //static call without object create
		 Demo obj=new Demo();
		 /*obj.fun();
		
		System.out.println(obj.i);
		System.out.println(obj.j);*/
	 }
 }
 