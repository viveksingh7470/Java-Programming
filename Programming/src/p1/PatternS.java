package p1;

import java.util.Scanner;

public class PatternS 
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
				if(j==0 && i!=0 && i!=n-1
						|| i==0 && j!=0 && j!=n-1
						|| i==n-1 && j!=0 && j!=n-1
						|| j==n-1 && i!=0 && i!=n-1
						|| j== n-1 && i!=0 && i<=n/4)
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