package p1;
import java.util.*;
class Demo
{
	void fun()
	{
		System.out.println("Connecation establish");
		
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the numenator");
			int x=sc.nextInt();
			System.out.println("Enter the denominator");
			int y=sc.nextInt();
			int z=x/y;
			System.out.println(z);
			
		}
		catch ( Exception e)
		{
			System.out.println("Proble solve");
		}
		System.out.println("Connecation trminated");
	}
}


class HandlinEx 
{
	public static void main(String[] args) 
	{
		System.out.println("Main() Started");
		Demo d=new Demo();
		d.fun();
		System.out.println("Main() completed");
	}
}
