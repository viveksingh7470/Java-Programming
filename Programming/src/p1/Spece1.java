package p1;
import java.util.Scanner;
class Spece1 
{
	public static void main(String[] args) 
	{
	System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();	
		String t=" ";
		for (int i=0 ;i<s.length();i++)
		{
			if (s.charAt(i)!=' ')
			{
				t=t+s.charAt(i);
			}
		}
		System.out.print(t);
	}
}