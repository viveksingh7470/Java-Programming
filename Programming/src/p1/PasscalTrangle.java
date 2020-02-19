package p1;

import java.util.Scanner;

public class PasscalTrangle 
{

	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the N:");
		int n=s.nextInt();
		int c=1;
		for (int i = 0; i <n; i++) 
		{
			for(int j=0; j<n-i; j++)
			{
			System.out.print(" ");	
			
			}
			for(int j=0; j<=i; j++)
			{
				if(j==i || j==0)
				{
					c=1;
				
			    }
				else
				{
					c=c*(i-j+1)/j;
				}
				System.out.print(c +" ");
				}
			System.out.println();
	}

}
}