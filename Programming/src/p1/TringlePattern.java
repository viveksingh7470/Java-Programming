package p1;

import java.util.Scanner;

public class TringlePattern 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N:");
		int n=sc.nextInt();
        for(int i = n; i >= 1; --i) 
        {
           
        	for(int j = 1;j <=n - i; ++j)
            {
                System.out.print("  ");
            }
            for(int j=i; j <= 2 * i - 1; ++j) 
            {
                System.out.print("* ");
            }
            for(int j = 0; j < i - 1; ++j)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

	}

}
