package p1;
import java.util.Scanner;
public class Palindrom
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the a String ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		boolean x=Palindrom(s);
		if(x== true)
		{
			System.out.println("Palindrome  ");
		}
		else
			
		{
			System.out.println("Not Palinstrome ");
		}

	}
      
	private static boolean Palindrom(String s) 
	{
		for(int i=0, j=s.length()-1; i<j; i++, j--)
		{
			System.out.println(s.charAt(i)+ "<=>" +s.charAt(j));
			if(s.charAt(i) != s.charAt(j))
			{
				return false;
			}
		}
		return true ;
	}
}

	
