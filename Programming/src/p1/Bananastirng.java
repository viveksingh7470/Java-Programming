package p1;
import java.util.Scanner;

public class Bananastirng 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		String  t="";
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i) == '0')
			{
				t=t +"*"+ s.charAt(i);
			}
			else
			{
				t=t+s.charAt(i);
			}
			System.out.print("*");
			System.out.print(t);
		}
	}

}
