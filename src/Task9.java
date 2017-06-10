public class Task9
{
	public static int[] solveETP(String[] students, String[] courses, int[][] studentCourses, int k)//Solves the schedule's assignment problem
	{
		if (!Task0.legalData(students, courses, studentCourses, k))
			throw new IllegalArgumentException("Illegal  Arguments");
		SATSolver.init(courses.length*k);
		int[][] variableNames=Task6.variableTable(courses.length, k);
		Task7.convertInput(variableNames, students, courses, studentCourses, k);
		boolean[] assignment=SATSolver.getSolution();
		if (assignment.length==0)
			return new int[0];
		int[] schedule=Task8.convertOutput(variableNames, assignment);
		if (!Task3.isLegalSchedule(schedule, students, courses, studentCourses, k))
			throw new AssertionError("Illegal schedule");
		return schedule;
	}
}