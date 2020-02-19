package p1;

import java.util.Scanner;

public class NumberPatern2 {

	public static void main(String[] args) 
	{
		int c=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the N:");
		int n=s.nextInt();
		for (int i = 1; i <=n; i++) 
		{
			if(i%2==0)
			{
				c=i*(i+1)/2;
				for(int j=1; j<=i; j++)
				{
					System.out.print(c-j+1 +" ");
				}
			}
			else
			{
				for(int j=1; j<=i; j++)
				{
					System.out.print(c+j +" ");
				}
			}
			System.out.println();
			
		}
		
		// TODO Auto-generated method stub

	}

}
