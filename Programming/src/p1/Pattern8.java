package p1;

import java.util.Scanner;

public class Pattern8 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the N:");
		int n=scan.nextInt();
		for(int i=0;i<n; i++)
		{
			for(int j=0; j<n;j++)
			{
				if(i+j>=n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			///////////******************Second pattern****************/
			for(int j=0;j<n;j++)
			{
				if(i==0 || i==n-1 || i==j || i+j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//*****************************Threed Pattern*********
			for(int j=0; j<n; j++)
			{
				System.out.print("*");
			}
			//****************pattern4******************
			for(int j=0; j<n; j++)
			{
				if(i==0 || i==n/2 ||i==n-1 || j==n/2 || j==0 || j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//*****************************Threed Pattern5*********
			for(int j=0; j<n; j++)
			{
				System.out.print("*");
			}
	///////////******************Second pattern****************/
				for(int j=0;j<n;j++)
				{
					if(i==0 || i==n-1 || i==j || i+j==n-1)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				//**********************7**************/
				for(int j=0; j<n; j++)
				{
					if(i>=j)
					{
						System.out.print("*");
					}
				}
			System.out.println();
		}
		

	}

}
