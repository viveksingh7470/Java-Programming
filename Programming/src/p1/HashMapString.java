package p1;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapString 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String  ");
		String str=scan.nextLine();
	      HashMap <Character, Integer> hMap = new HashMap();
	      for (int i = str.length() - 1; i>=0; i--)
	      {
	         if (hMap.containsKey(str.charAt(i))) 
	         {
	            int count = hMap.get(str.charAt(i));
	            hMap.put(str.charAt(i), ++count);
	         } else 
	         {
	            hMap.put(str.charAt(i),1);
	         }
	      }
	      System.out.print(hMap);
	   }
	}