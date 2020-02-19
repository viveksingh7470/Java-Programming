package p1;

import java.util.Arrays;
import java.util.Scanner;

public class Anagaram 
{

	public static void main(String[] args) 
	{
		Scanner ac=new Scanner(System.in);
		System.out.println("Enter the Frist String ");
		String x=ac.nextLine();
		System.out.println("Enter the Second String ");
		String y=ac.nextLine();
		x=x.replace(" ", " ");
		y=y.replace(" ", " ");
		x=x.toLowerCase();
		y=y.toLowerCase();
		char a[]=y.toCharArray();
		char b[]=x.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		boolean result =Arrays.equals(a, b);
		if(result==true)
		{
			System.out.println("String are anagram");
		}
		else
		{
			System.out.println("String are not anagram");
			
		}
		
	}

	}

