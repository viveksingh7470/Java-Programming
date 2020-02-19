package p1;
		
import java.util.Scanner;

public class JavaPascalTriangle
{
    public static void main(String args[])
	{
	    int n, c=1;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		n = scan.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for( int j=n; j>i; j--)
			{
				System.out.print(" ");
			}
            c = 1;
			for(int j=0;j<=i;j++)
			{
				 System.out.print(c+ " ");
                 c = c * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}
}