public class Instance3
{
	public static void main(String[] args)
	{
		String[] students={"s0", "s1", "s2", "s3", "s4", "s5", "s6", "s7"};
		String[] courses={"c0", "c1", "c2", "c3", "c4", "c5"};
		int[][] studentCourses={
				{0, 1},
				{1, 2},
				{2, 3},
				{3, 4},
				{4, 5},
				{0, 1},
				{1, 2},
				{2, 3}};
		int k=2; // Try various k values for Task9, and use it without k for Task10.
		
		System.out.println();
		System.out.println("INSTANCE");
		Task1.printStudentData(students, courses, studentCourses, k);
		System.out.println();
		System.out.println("SCHEDULE");
		int[] schedule=Task9.solveETP(students, courses, studentCourses, k);
		Task2.printSchedule(schedule, courses);
	}
}