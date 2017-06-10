public class Task8
{
	public static int[] convertOutput(int[][] variableNames, boolean[] assignment)//Converts the solution that the SAT gave to actual possible schedule.
	{
		int[] schedule=new int[variableNames.length];
		for (int i=0; i<variableNames.length; i++)
			for (int j=0; j<variableNames[i].length; j++)
				if (assignment[variableNames[i][j]])
					schedule[i]=j;
		return schedule;
	}
}