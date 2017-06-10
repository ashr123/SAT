public class Instance13
{
	public static void main(String[] args)
	{
		String[] students={"s0", "s1", "s2", "s3", "s4", "s5", "s6", "s7", "s8", "s9", "s10", "s11",
				"s12", "s13", "s14", "s15"};
		String[] courses={"c0", "c1", "c2", "c3", "c4", "c5", "c6", "c7", "c8", "c9", "c10", "c11"};
		int[][] studentCourses={
				{0, 3, 4, 9, 11},
				{6, 7, 9, 11},
				{4, 6, 10},
				{1, 3, 4, 5},
				{0, 2, 9},
				{6, 8, 9},
				{0, 1, 6, 11},
				{1, 4, 8, 10},
				{7, 8, 9},
				{3, 5, 6, 9},
				{2, 4, 8},
				{0, 4, 8},
				{0, 1, 2, 11},
				{0, 1, 5},
				{0, 3, 8},
				{9, 10, 11}
		};
		int k=100;
		
		System.out.println();
		System.out.println("INSTANCE");
		Task1.printStudentData(students, courses, studentCourses, k);
		System.out.println();
		System.out.println("SCHEDULE 9");
		Task2.printSchedule(Task9.solveETP(students, courses, studentCourses, k), courses);
		System.out.println("\nSCHEDULE 10");
		Task2.printSchedule(Task10.solveMinDaysETP(students, courses, studentCourses), courses);
	}
}