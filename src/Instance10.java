public class Instance10
{
	public static void main(String[] args)
	{
		String[] students={"Student_0", "Student_1", "Student_2", "Student_3", "Student_4", "Student_5"};
		String[] courses={"Course_0", "Course_1", "Course_2", "Course_3", "Course_4", "Course_5", "Course_6", "Course_7", "Course_8"};
		
		int[][] studentCourses={{1, 2, 4, 6, 7, 8}, {3, 4, 5}, {0, 1, 5, 6, 7}, {3, 4, 6, 7}, {2, 7}, {4, 6, 8}};
		
		
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