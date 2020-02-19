package p1;

import java.util.Scanner;

public class Alphbet
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n=sc.nextInt();
		char c=(char)(n+64);
		if(n<=26)
		{
			System.out.println(c);
		}
		else
		{
			char s=(char)(n/26);
			int k=n%26;
			System.out.println(c);

		}

	}

}
