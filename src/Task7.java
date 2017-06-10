public class Task7
{
	public static void convertInput(int[][] variableNames, String[] students, String[] courses, int[][] studentCourses, int k)//Converts the variables's array to clauses.
	{
		// part 1
		for (int i=0; i<variableNames.length; i++)
			SATSolver.addClauses(Task5.exactlyOne(variableNames[i]));
		
		// part 2
		boolean[][] conflicts=Task4.findExamConflicts(variableNames.length, studentCourses);
		for (int i=0; i<conflicts.length; i++)
			for (int j=i+1; j<conflicts[i].length; j++)
				if (conflicts[i][j])
					SATSolver.addClauses(Task5.notSameDay(variableNames[i], variableNames[j]));
	}
}