public class Task0
{
	public static boolean legalData(String[] students, String[] courses, int[][] studentCourses, int k)
	{
		if (k<=0 || students==null || studentCourses==null || students.length!=studentCourses.length || students.length==0 || courses==null || courses.length==0 || studentCourses.length==0)
			return false;
		
		int[] courseStudents=new int[courses.length];
		
		for (int i=0; i<studentCourses.length; i++)
		{
			if (studentCourses[i]==null || studentCourses[i].length==0 || studentCourses[i][0]>=courses.length)
				return false;
			for (int j=0; j<studentCourses[i].length-1; j++)
			{
				
				for (int l=j+1; l<studentCourses[i].length; l++)//Checks if there's no repetition in the courses that the student "i" is registered for.
					if (studentCourses[i][l]>=courses.length || studentCourses[i][j]==studentCourses[i][l])
						return false;
				courseStudents[studentCourses[i][j]]++;
			}
			courseStudents[studentCourses[i][studentCourses[i].length-1]]++;
		}
		for (int i=0; i<courseStudents.length; i++)//Checks if there's an empty course.
			if (courseStudents[i]==0)
				return false;
		
		if (students[students.length-1]==null || students[students.length-1].length()==0)
			return false;//Checks if there's repetitions in the students's name.
		for (int i=0; i<students.length-1; i++)
		{
			if (students[i]==null || students[i].length()==0)
				return false;
			for (int j=i+1; j<students.length; j++)
				if (students[i].contentEquals(students[j]))
					return false;
		}
		
		if (courses[courses.length-1]==null || courses[courses.length-1].length()==0)
			return false;//Checks if there's repetitions in the courses's name.
		for (int i=0; i<courses.length-1; i++)
		{
			if (courses[i]==null || courses[i].length()==0)
				return false;
			for (int j=i+1; j<courses.length; j++)
				if (courses[i].contentEquals(courses[j]))
					return false;
		}
		
		return true;
	}
}