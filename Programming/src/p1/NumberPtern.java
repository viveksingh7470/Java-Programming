package p1;

import java.util.Scanner;

public class NumberPtern 
{

	public static void main(String[] args) 
	{
		int c1=1;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the N:");
		int n=s.nextInt();
		int c2=n*n+1,k=n-1;
		for (int i = 0; i <n; i++) 
		{
			for(int j=0; j<=i-1; j++)
			{
				System.out.print("__");
			}
			for(int j=0; j<n-i; j++)
			{
				System.out.print(c1++);
				System.out.print("*");
			}
			for(int j=0; j<n-i; j++)
			{
				System.out.print(c2+j);
				if(j<n-i-1)
				{
					System.out.print("*");
				}
				
				
			}
			c2=c2-k;
			k--;
			System.out.println();
		}
		
	}

}
