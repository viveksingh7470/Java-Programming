package p1;
import java.util.*;
class Boolean1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String1");
		String si1=sc.nextLine();
		System.out.println("enter the String2");
		String si2=sc.nextLine();
		boolean x=Compare(si1,si2);
		if (x=true)
		{
			System.out.println("Equals");
		}
		else
		{
			System.out.println(" Not Equals");
		}
	}

	 static boolean Compare(String si1, String si2) 
	{
		{
			if (si1.length()!=si2.length())
			{
				return false;
			}
			for (int i=0;i<si1.length() ;i++ )
			{
			if (si1.charAt(i)!=si2.charAt(i))
			{
				return false;
			}
			return true;
			}
	}
		return false;

	}
}