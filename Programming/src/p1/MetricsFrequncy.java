package p1;

public class MetricsFrequncy {

	public static void main(String[] args) {
		int countEvent = 0;
		int countOld = 0;
		int a[][]= {{4,1,3},
				    {3,5,7},
				    {8,2,6}};
		int row=a.length;
		int col =a[0].length;
		for(int i=0;i<row; i++)
		{
			for(int j=0;j<col; j++)
			{
				if(a[i][j]%2==0)
				{
				 countEvent++;
				}
				
				 else
				 {
					 countOld++;
					
				}
			}
			System.out.println("Count Even  "+countEvent);
			System.out.println("Count old   "+countOld);
		}
	
	}

}
