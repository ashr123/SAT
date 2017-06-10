public class Instance2
{
	public static void main(String[] args)
	{
		String[] students={"s0", "s1", "s2", "s3", "s4"};
		String[] courses={"c0", "c1", "c2", "c3"};
		int[][] studentCourses={
				{0, 1, 2, 3},
				{0, 1, 2, 3},
				{0, 1, 2, 3},
				{0, 1, 2, 3},
				{0, 1, 2, 3}};
		int k=4; // Try various k values for Task9, and use it without k for Task10.
		
		System.out.println();
		System.out.println("INSTANCE");
		Task1.printStudentData(students, courses, studentCourses, k);
		System.out.println();
		System.out.println("SCHEDULE");
		int[] schedule=Task9.solveETP(students, courses, studentCourses, k);
		Task2.printSchedule(schedule, courses);
	}
}