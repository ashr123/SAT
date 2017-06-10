public class Task6
{
	public static int[][] variableTable(int m, int k)//Creates and returns an array of variables.
	{
		int[][] variableNames=new int[m][k];
		
		int count=1;
		for (int i=0; i<m; i++)
			for (int j=0; j<k; j++)
				variableNames[i][j]=count++;
		
		return variableNames;
	}
}