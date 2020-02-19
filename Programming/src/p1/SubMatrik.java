package p1;

public class SubMatrik 
{
	public static void main(String args[])
	{
		int row,cols;
		int a[][]= {{3,4,6},{2,5,8}};
		int b[][]= {{1,2,3},{1,4,7}};
		row=a.length;
		cols=a[0].length;
		int sub[][]=new int [row][cols];
		for(int i=0;i<row; i++)
		{
			for(int j=0;j<cols;j++)
			{
				sub[i][j]=a[i][j]-b[i][j];
				
			}
		}
		System.out.println("Subtraction of two String");
		for(int i=0;i<row; i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(sub[i][j]+" ");
				
			}
			System.out.println();
		}
		
	}

}
