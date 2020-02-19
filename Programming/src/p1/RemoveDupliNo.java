package p1;

import java.util.HashSet;

public class RemoveDupliNo 
{

	public static void main(String[] args) 
	{

		int []a= {1,2,5,8,2,3,4,4,5,};
		HashSet<Integer>hs=new HashSet<>();
		for(int i=0;i<a.length;i++)
		{
			hs.add(a[i]);
		}
		for(int no:hs)
		{
			System.out.println(no+" ");
		}

	}

}
