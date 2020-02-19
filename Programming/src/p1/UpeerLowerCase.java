package p1;

import java.util.Scanner;

public class UpeerLowerCase 
{

	public static void main(String[] args) 
	{
		char t=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>=65 && s.charAt(i)<=90)
			{
				t=(char) (s.charAt(i)+32);
				
			}
			else
			{
				if(s.charAt(i)>=97 && s.charAt(i)<=122)
				{
					t=(char) (t+(char)(s.charAt(i)-32));
					
				}
				else
				{
					t=(char) (t+s.charAt(i));
				}
			}
		}
		System.out.println(t);
		
		}

	}


