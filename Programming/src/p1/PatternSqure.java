package p1;

import java.util.Scanner;

public class PatternSqure 
{

	public static void main(String[] args) 
	{
		int count = 0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the N:");
		int n=scan.nextInt();
		for(int i=0; i<n;i++)
		{
			for(int j=0;j<n; j++)
			{
				if( i==0 || j==0 ||i==j ||j==n-1 || i==n-1 || i+j==n-1 || i+j==n/2 || i-j==n/2 || j-i==n/2 || (i+j==n+n/2-1))
				{
					System.out.print(count);
					{
						count++;
					}
					
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
