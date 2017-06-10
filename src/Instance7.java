public class Instance7
{
	public static void main(String[] args)
	{
		String[] students={"Student_0", "Student_1", "Student_2", "Student_3", "Student_4", "Student_5", "Student_6", "Student_7", "Student_8"};
		String[] courses={"Course_0", "Course_1", "Course_2", "Course_3", "Course_4"};
		
		int[][] studentCourses={{0, 2}, {1, 4, 2}, {2}, {0, 4, 2, 1}, {0, 1, 4}, {2, 3}, {0}, {3}, {0, 2, 3}};
		
		
		// Try various k values for Task9, and use it without k for Task10.


//		System.out.println();
//		System.out.println("INSTANCE");
//		Task1.printStudentData(students, courses, studentCourses, k);
		System.out.println();
		System.out.println("SCHEDULE");
		int[] schedule=Task10.solveMinDaysETP(students, courses, studentCourses);
		Task2.printSchedule(schedule, courses);
	}
}