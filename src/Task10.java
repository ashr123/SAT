public class Task10
{
	public static int[] solveMinDaysETP(String[] students, String[] courses, int[][] studentCourses)//Exactly like Task9, but finds by itself a solution for the smallest k possible.
	{
		if (!Task0.legalData(students, courses, studentCourses, 1))
			throw new IllegalArgumentException("Illegal  Arguments");
		boolean[] assignment={};
		int[][] variableNames={};
		int i=0;
		while (assignment.length==0)
		{
			i++;
			SATSolver.init(courses.length*i);
			variableNames=Task6.variableTable(courses.length, i);
			Task7.convertInput(variableNames, students, courses, studentCourses, i);
			assignment=SATSolver.getSolution();
		}
		int[] schedule=Task8.convertOutput(variableNames, assignment);
		if (!Task3.isLegalSchedule(schedule, students, courses, studentCourses, i))
			throw new AssertionError("Illegal schedule");
		return schedule;
	}
}