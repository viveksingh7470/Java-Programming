package p1;

import java.util.Scanner;

public class ReverceString 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String l=" ";
		for (int i=s.length()-1 ;i>0 ;i-- )
		{
			l=l+s.charAt(i); 
		}
		System.out.print(l);

	}

}
