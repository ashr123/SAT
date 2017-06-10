public class Instance11
{
	public static void main(String[] args)
	{
		String[] students={"s0", "s1", "s2", "s3", "s4", "s5", "s6", "s7", "s8", "s9", "s10", "s11", "s12", "s13", "s14"};
		String[] courses={"c0", "c1", "c2", "c3", "c4", "c5", "c6", "c7", "c8", "c9"};
		int[][] studentCourses={
				{0, 1, 2, 3, 4, 6},
				{0, 2, 3, 6, 7, 8, 9},
				{1, 2, 3, 5, 7, 8, 9},
				{0, 3, 4, 5, 8},
				{2, 5, 8},
				{1, 2, 3, 5, 6, 8, 9},
				{0, 1, 3, 4, 6, 9},
				{1, 4, 5, 6, 8},
				{0, 1, 2, 3, 6, 7, 8},
				{6, 7, 8, 9},
				{0, 1, 3, 5, 8, 9},
				{0, 1, 2, 3, 5, 6, 7, 9},
				{0, 1, 2, 3},
				{0, 1, 2, 3, 4},
				{0, 1, 2, 4, 6, 7}};
		int k=8; // Try various k values for Task9, and use it without k for Task10.
		
		System.out.println();
		System.out.println("INSTANCE");
		Task1.printStudentData(students, courses, studentCourses, k);
		System.out.println();
		System.out.println("SCHEDULE 9");
		Task2.printSchedule(Task9.solveETP(students, courses, studentCourses, k), courses);
		//System.out.println("\nSCHEDULE 10");
		//Task2.printSchedule(Task10.solveMinDaysETP(students, courses, studentCourses), courses);
	}
}