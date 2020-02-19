package p1;

import java.util.Scanner;

public class NumbePattern4 
{

	public static void main(String[] args) 
	{
		int c=1;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the N:");
		int n=scan.nextInt();
		for(int i=0;i<n; i++)
		{
			for (int j = 0; j <=i; j++)
			{
				
				System.out.print(c++);
				if(j<=i-1)
				{
					System.out.print("*");
				}
				
			}
			System.out.println();
		}

	}

}
