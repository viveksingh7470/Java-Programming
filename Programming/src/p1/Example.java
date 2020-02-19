package p1;

import java.util.Scanner;

public class Example 
{

	public static void main(String[] args) 
	{
		int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N:");
		int n=sc.nextInt();
		for(int i=1; i<=n;i++)
		{
			c=n*(n+i)%2;
			for(int j=1;j<=i;i++)
			{
				System.out.print(c--+" ");
			}
			System.out.println();
		}
		

	}

}
