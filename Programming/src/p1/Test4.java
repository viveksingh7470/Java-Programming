package p1;
class Test4 
{
	public static void main(String[] args) 
	{
		int ar[][]=new int[3][];
		ar[0]=new int [1];
		ar[1]=new int [2];
		ar[2]=new int [3];
		int sum=0;
		for (int i=0;i<3;++i)
			for (int j=0;j<i+1;++j)
			ar[i][j]=j+1;
		for (int i=0;i<3;++i)
			for (int j=0;j<i+1;++j)
			sum+=ar[i][j];
		System.out.println(sum);
	}
}
