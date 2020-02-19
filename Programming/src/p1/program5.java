package p1;
import java.util.Scanner;

public class program5
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N:");
		int n=sc.nextInt();
		for (int i=2; i<=n; i++)
		{
			if ( i%2 == 0|| i%3==0);
			System.out.print(i);
		}
	}

}
