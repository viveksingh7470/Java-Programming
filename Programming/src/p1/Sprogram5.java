package p1;
import java.util.Scanner;

public class Sprogram5 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String s=sc.nextLine();
		int s1=0,c1=0;
		String res=" ";
		for (int i=0; i<s.length(); i++)
		{
			if(s.charAt(i) != ' ')
			{
				s1=i;
				break;
			}
		}
		for (int i=s.length()-1 ;i>=0 ; i--)
		{
			if(s.charAt(i) != ' ')
			{
				c1=i;
				break;
			}
		}
		for(int i=s1; i<=c1; i++)
		{
			res=res+s.charAt(i);
		}
		System.out.println(res);

	}

}
