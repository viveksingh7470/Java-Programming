package p1;
import java.util.Scanner;

public class Sprogram6
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=sc.nextInt();
		if(n%3 ==0)
		{
			System.out.println("aa");
		}
		else
			if(n%5 ==0)
			{
				System.out.println("bb");
			}
			else
				if(n%15 ==0)
				{
					System.out.println("cc");
				}

	}

}
