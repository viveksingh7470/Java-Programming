package p1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Annagram 
{

	public static void main(String[] args) 
	{
		String str1="Java";
		String str2="avaj";
		System.out.println("Both string are anagrams" +anagramCheck(str1,str2));

		

	}
	public static boolean anagramCheck(String str1,String str2)
	{
		char[] charArrayFromString1=str2.toCharArray();
		char[] charArrayFromString2=str2.toCharArray();
		Arrays.sort(charArrayFromString1);
		Arrays.sort(charArrayFromString2);
		
		
		return Arrays.equals(charArrayFromString1,charArrayFromString2);
		
	}

}
