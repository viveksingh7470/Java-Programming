package p1;

import java.util.Arrays;

public class Anagram 
{

	public static void main(String[] args) 
	{
		String y="java";
		String x="avaj";
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
