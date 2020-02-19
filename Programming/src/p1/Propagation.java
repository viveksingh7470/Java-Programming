package p1;
import java.util.*;
class Demo1
{
	void fun1()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the numerator");
		int x=sc.nextInt();
		System.out.println("Enter the demenotor");
		int y=sc.nextInt();
		int z=x/y;
		System.out.println(z);
	}
}
class Demo2
{
	void fun2()
	{
		Demo1 d1=new Demo1();
		d1.fun1();
	}
}
class Demo3
{
	void fun3()
	{
		Demo2 d2=new Demo2();
		d2.fun2();
	}
}


class Propagation 
{
	public static void main(String[] args) 
	{
		System.out.println("Connecation establish");
		Demo3 d3=new Demo3();
		d3.fun3();
		System.out.println("Connecation Tremineter");
	}
}
