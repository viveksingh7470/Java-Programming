package p1;

import java.util.Scanner;

public class NumberPattern1
{

	public static void main(String[] args) 
	{
		int c=1;
		Scanner scan =new Scanner(System.in);
		System.out.println(" Enter the N:");
		int n=scan.nextInt();
		for (int i = 1; i <n; i++)
		{
			c=i;
			for(int j=1; j<n; j++)
			{
				System.out.print(" "+c++);
				
			}
			System.out.println();
			
		}

	}

}
