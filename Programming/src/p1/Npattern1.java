package p1;

import java.util.Scanner;

public class Npattern1 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the N :");
		int n=scan.nextInt();
		int c1=1,c2=n;
		int k = 0;
		for(int i=1; i<=n; i++)
		{
			for(int j=0;j<i; j++)
			{
				System.out.print("- -");
			}
			for(int j=0; j<n-i; j++)
			{
				System.out.print(c1++ +"*");
			}
			for(int j=0; j<n-i; j++)
			{
				System.out.print(" *"+c2+j );
				if(j<-i-1 )
				{
					System.out.print("");
				}
			}
			c2=c2-k;
			 k--;
			System.out.println();
			
		}


	}

}
