package p1;

import java.util.Scanner;

public class PatternM 
{

	public static void main(String[] args) 
	{

		Scanner scan=new Scanner(System.in);
		System.out.println("enter the N:");
		int n=scan.nextInt();
		for(int i=0; i<n;i++)
		{
			for(int j=0;j<n; j++)
			{
				if(j==0 || i==j && j<=n-6|| i+j==n-1 && j>=n-5 || j==n-1 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}


	}

}
