package p1;

import java.util.Scanner;

public class PatternH 
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
				if( i==n/2 || j==0  || j==n-1)
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
