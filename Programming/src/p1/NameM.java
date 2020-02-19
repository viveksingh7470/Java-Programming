package p1;
import java.util.*;
class NameM 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i=0 ;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				System.out.print("*");
			}
			for (int j=0;j<n ;j++ )
			{
				System.out.print(" ");
			}

			for (int j=0;j<n ;j++ )
				
			{
				System.out.print("0");
			}
			for (int j=0;j<n ;j++ )
			{
				System.out.print("*");
			}


			System.out.println();
		}
	}
}
