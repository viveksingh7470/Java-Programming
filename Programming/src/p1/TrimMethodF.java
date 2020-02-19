package p1;

import java.util.Scanner;

public class TrimMethodF 
{

	public static void main(String[] args)
	{
		int s1=0,c1=0;
		String res=" ";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				s1=i;
				break;
			}
		}
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)!=' ')
			{
				c1=i;
				break;
			}
		}
		for(int i=s1; i<=c1;i++)
		{
			res=res+s.charAt(i);
		}
		System.out.println(res);
		

	}

}
