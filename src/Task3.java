public class Task3
{
	public static boolean isLegalSchedule(int[] schedule, String[] students, String[] courses, int[][] studentCourses, int k)//Checks if a given schedule is legal.
	{
		if (schedule[schedule.length-1]>=k)
			return false;
		for (int i=0; i<schedule.length-1; i++)
		{
			if (schedule[i]>=k)
				return false;
			for (int j=i+1; j<schedule.length; j++)
				if (schedule[i]==schedule[j])
					for (int l=0; l<studentCourses.length; l++)
					{
						boolean firstCourse=false, secondCourse=false;
						for (int m=0; m<studentCourses[l].length; m++)//Checks if different courses are in the same day.
						{
							if (studentCourses[l][m]==i)
								firstCourse=true;
							if (studentCourses[l][m]==j)
								secondCourse=true;
							if (firstCourse && secondCourse)
								return false;
						}
					}
		}
		
		return true;
	}
	
	public static int[] findConflictingStudent(int[] schedule, String[] students, String[] courses, int[][] studentCourses, int k)//Finds potential conflicting courses.
	{
		for (int i=0; i<studentCourses.length; i++)
			for (int j=0; j<studentCourses[i].length-1; j++)
				for (int l=j+1; l<studentCourses[i].length; l++)
					if (schedule[studentCourses[i][j]]==schedule[studentCourses[i][l]])
						return new int[]{schedule[studentCourses[i][j]], i, studentCourses[i][j], studentCourses[i][l]};
		return new int[0];
	}
	
	public static void printConflictingStudent(int[] schedule, String[] students, String[] courses, int[][] studentCourses, int k)//Prints the potential conflicting courses.
	{
		int[] conflictingStudent=findConflictingStudent(schedule, students, courses, studentCourses, k);
		if (conflictingStudent.length!=0)
			System.out.print(students[conflictingStudent[1]]+" cannot take exams in "+courses[conflictingStudent[2]]+" and "+courses[conflictingStudent[3]]+" as scheduled on day "+conflictingStudent[0]);
	}
}