package p1;
import java.util.Scanner;

public class Removespecal 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String s=sc.nextLine();
		String t="";
		for (int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>=97 && s.charAt(i)<=122 || s.charAt(i)>=65 && s.charAt(i)<=97)
			{
				t=t+s.charAt(i);
			}
		}
		System.out.println(t);
	}

}
