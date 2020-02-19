package p1;

import java.util.Scanner;

class Arith
{
	
	int temp;
    void add(int x,int y)
    {
        temp=x+y;
        System.out.println(temp);
       
    }
	void subtraction(int x,int y)
	{
	int   m = x-y;
	  
	}
	void multiplication(int x,int y)
	{
	int   m = x*y;
	  
	}
	void division(int x,int y)
	{
	int   m = x+y;
	  
	}
	
}
	
public class Calculator3 
{

	public static void main(String[] args) 
	{
		
        

		int a,b;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	a=sc.nextInt();
	System.out.println("Enter second number");
	b=sc.nextInt();
	Arith r=new Arith();
    r.add(a,b);
    int temp=0;
	
	
	}

}
