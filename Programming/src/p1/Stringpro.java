package p1;
import java.util.Scanner;

public class Stringpro 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the String1");
		String s1=sc.nextLine();
		System.out.println("Enter the String2");
		String s2=sc.nextLine();
		boolean x= Compare(s1,s2);
		if(x=true)
		{
			System.out.println("Equals");
			
		}
		else
		{
			System.out.println(" Not Equals");
		}	
	}
    static boolean Compare(String s1, String s2) 
	{
			if(s1.length() !=s2.length())
			{
				return false;
			}
			for(int i=0; i<s1.length(); i++)
			{
				if(s1.charAt(i) !=s2.charAt(i))
				{
					return false;
				}
			
			}
			return true;
	}

}
