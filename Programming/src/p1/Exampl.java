package p1;

import java.util.Scanner;
public class Exampl 
{

	void exam()
	{
		String s = "cow how now now cow how cow how how";
		String res[] = s.split(" ");
		int c=0,n=0,h=0;
		for(int i=0;i<res.length;i++)
		{
			if(res[i].equals("cow"))
			{
				++c;
			}
			else if(res[i].equals("now"))
			{
				++n;
			}
			else
			{
				++h;
			}
		}
		if(c>h&&c>n)
		{
			System.out.println("Cow "+c);
		}
		else if(n>c&&n>h)
		{
			System.out.println("Now "+n);
		}
		else
		{
			System.out.println("How "+h);
		}
	}
	void m()
	{
		// Write a program to remove no. from String
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter String ");
		String s = scn.nextLine();
		String res = "";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=65&&s.charAt(i)<=90||s.charAt(i)>=97&&s.charAt(i)<=122||s.charAt(i)==' ')
			{
				res += s.charAt(i);
			}
		}
		System.out.println(res);
	}
	public static void main(String[] args)
	{
		new Exampl().m();
	}
}
