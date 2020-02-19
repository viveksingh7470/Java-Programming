package p1;
class NumberP2 
{
	public static void main(String[] args) 
	{
	int n=4;
	for (int i=0 ;i<=n ;i++)
	{
		if (i%2==0)
		{
			System.out.print(i+1);
		}
		for (int j=1 ;j<=n ;j++ )
		{
			System.out.print(i);
		}
		if (i%2 !=0)
		{
			System.out.println();
		}
	}
	}
}
