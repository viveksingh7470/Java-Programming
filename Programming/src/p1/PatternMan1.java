package p1;

import java.util.Scanner;

public class PatternMan1 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the N:");
		int n=scan.nextInt();
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<n; j++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<n; j++)
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
			for(int j=0; j<n; j++)
			{
				if(i>j)
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
		//*********************************Second*********************
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<n; j++)
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
			for(int j=0; j<n; j++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<n; j++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<n; j++)
			{
				if(i>=j)
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
		//******************3**********************/
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<n; j++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<n; j++)
			{
				System.out.print("1");
			}
			for(int j=0; j<n; j++)
			{
				System.out.print("1");
			}
			for(int j=0; j<n; j++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
		//***************************Upper Body/////////
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(i+j>=n-1 && i+j<=n+n/2-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0; j<n; j++)
			{
				System.out.print("*");
			}
			for(int j=0; j<n; j++)
			{
				System.out.print("*");
			}
			for(int j=0; j<n; j++)
			{
				System.out.print("*");
			}
			for(int j=0; j<n; j++)
			{
				System.out.print("*");
			}
			for(int j=0; j<=i; j++)
			{
				if(i>j)
				{
					System.out.print("1");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
				 
		}
		for (int i = 0; i <n; i++) 
		{
			for (int j = 0; j <n; j++) 
			{
				if(j<=n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for (int j = 0;  j< n; j++) 
			{
				System.out.print(" 1");
				
			}
			for (int j = 0;  j< n; j++) 
			{
				System.out.print(" 0");
				
			}
			for (int j = 0;  j< n; j++) 
			{

				if(i<=n-1)
				{
					System.out.print("1");
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
