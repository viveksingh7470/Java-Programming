package p1;
import java.util.Scanner;

public class Supercase
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String s=sc.nextLine();
		String t="";
		for(int i=0; i<s.length(); i++)
		if(s.charAt(i)>=65 && s.charAt(i)<=90)
		{
			t=t+(char)(s.charAt(i)+32);
			
		}
		else
			if(s.charAt(i)>=97 && s.charAt(i)<=122)
			{
				t=t+(char)(s.charAt(i)-32);
				
			}
			else
			{
				t=t+s.charAt(i);
			}
		System.out.println(t);



	}

}
