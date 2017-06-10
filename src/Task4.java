public class Task4
{
	public static boolean[][] findExamConflicts(int m, int[][] studentCourses)//
	{
		boolean[][] table=new boolean[m][m];
		for (int i=0; i<studentCourses.length; i++)
			for (int j=0; j<studentCourses[i].length-1; j++)
				for (int k=j+1; k<studentCourses[i].length; k++)
					if (studentCourses[i][j]!=studentCourses[i][k])
						table[studentCourses[i][j]][studentCourses[i][k]]=table[studentCourses[i][k]][studentCourses[i][j]]=true;
		return table;
	}
}