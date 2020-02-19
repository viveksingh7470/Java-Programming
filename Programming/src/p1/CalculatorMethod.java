package p1;

import java.util.Scanner;

class  CalculatorMethod
{
	
	static int a=0;
	static int b=0;
	   public int add()
	    { 
		  
	        int add=0;
	        add=a+b;
	        System.out.println("Addtion   "+add);
			return add;
	    }
	    

	   public int Sub()
	    {
		   int subb=0;
	        subb=a-b;
	        System.out.println("Subtraction  "+subb);
		  return subb;
	    }
	    

	   public int Mull()
	    {
		   int mul=0;
		  mul =a*b;
		   System.out.println("Multiplication   "+mul);
	        return mul;
	    }
	   

	   public int Div()
	    {
		   int divv=0;
		   divv=a/b;
		   System.out.println("Division   "+divv);
		   return divv;
	       
	    }

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a N:");
		a=sc.nextInt();
		System.out.println("Enter the b N:");
	    b=sc.nextInt();
	    CalculatorMethod ad=new  CalculatorMethod();
		ad.add();
		ad.Sub();
		ad.Mull();
		ad.Div();
	}

}
