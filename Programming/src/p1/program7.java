package p1;
import java.util.Scanner;

public class program7 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the String ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String t="";
		for (int i=s.length()-1; i>0; i--)
		{
			t=t+s.charAt(i);
		}
		System.out.println(t);
			
			

	}

}
