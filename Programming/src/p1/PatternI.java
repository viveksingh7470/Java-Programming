package p1;

import java.util.Scanner;

public class PatternI 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the N:");
		int n=scan.nextInt();
		for(int i=0; i<n;i++)
		{
			for(int j=0;j<n; j++)
			{
				if(i==0 && j>=n/4 
					|| i==n-1 && j>=n/4|| j==n/2 )
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
