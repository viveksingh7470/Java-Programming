package p1;

import java.util.Scanner;

public class TringlePattern1 
{

	public static void main(String[] args)
	{
		int k=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N:");
		int n=sc.nextInt();
        for(int i = 1; i <=n; ++i, k = 0)
        {
            for(int j = 1;j <=n - i; ++j) 
            {
                System.out.print("  ");
            }
            while(k != 2 * i - 1) 
            {
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }
	}

}
