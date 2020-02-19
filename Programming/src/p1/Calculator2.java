//Using method calling to print the addition of two numbers.
package p1;

import java.util.Scanner;

class Add
{
	int c;
	int  add;
	
	void addition(int x,int y)
	{
	 c=x+y;
	  add=x+y;
	}
	void subtraction(int x,int y)
	{
	 c=x-y;
	}
	void multiplication(int x,int y)
	{
	 c=x*y;
	}
	void division(int x,int y)
	{
	 c=x/y;
	}
}
public class Calculator2 
{

	public static void main(String[] args)
	{
		int a,b;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	a=sc.nextInt();
	System.out.println("Enter second number");
	b=sc.nextInt();
	Add r=new Add();
	r.addition(a,b);
	System.out.println("Addition: "+r.c);
	r.subtraction(a,b);
	System.out.println("Subtraction: "+r.c);
	r.multiplication(a,b);
	System.out.println("Multiplication: "+r.c);
	r.division(a,b);
	System.out.println("Division: "+r.c);
	System.out.println("Addition2: "+r.add);
	}

}
