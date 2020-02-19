package p1;

import java.util.Scanner;

class Arithm
{
	int temp;
	int  add(int x, int y,String e)
	{
		temp=x+y; 
		return temp;
		
	}
	int sub(int x,int y)
	{
		temp=x-y;
		return temp;
		
	}
	int mul(int x,int y)
	{
		temp=x*y;
		return temp;
		
	}
	int div(int x,int y)
	{
		temp=x/y;
		return temp;
		
	}
	
}
public class Calculator4 
{

	public static void main(String[] args) 
	{
		int c=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	int a=sc.nextInt();
	System.out.println("Enter second number");
	int b=sc.nextInt();
	Arithm r=new Arithm();
	String e = "hello";
	c=r.add(a,b,e);
	System.out.println("Addtion : "+c);
	c=r.sub(a,b);
	System.out.println("Subtraction : "+c);
	c=r.mul(a,b);
	System.out.println("Multiplication: "+c);
	c=r.div(a,b);
	System.out.println("Division: "+c);
	System.out.println(e);

	}

}
