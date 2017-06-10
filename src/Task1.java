public class Task1
{
	public static void printStudentData(String[] students, String[] courses, int[][] studentCourses, int k)//Prints for each student his name and the courses he/she is registered for.
	{
		if (!Task0.legalData(students, courses, studentCourses, k))
			throw new IllegalArgumentException("Illegal  Arguments");
		for (int i=0; i<students.length; i++)
		{
			System.out.print(students[i]+": "+courses[studentCourses[i][0]]);
			for (int j=1; j<studentCourses[i].length; j++)
				System.out.print(", "+courses[studentCourses[i][j]]);
			if (i<students.length-1) System.out.println("");
		}
	}
}