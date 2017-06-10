public class Instance15
{
	public static void main(String[] args)
	{
		String[] students={"s0", "s1", "s2", "s3", "s4", "s5", "s6", "s7", "s8", "s9", "s10", "s11", "s12", "s13", "s14", "s15"};
		String[] courses={"c0", "c1", "c2", "c3", "c4", "c5", "c6", "c7", "c8", "c9", "c10", "c11", "c12", "c13", "c14", "c15"};
		int[][] studentCourses={
				{0, 3, 4, 9, 11},
				{6, 7, 9, 11, 12},
				{1, 3, 5, 13},
				{1, 3, 4, 5, 12},
				{5, 7, 11, 14},
				{2, 5, 12},
				{5, 7, 8, 11},
				{1, 4, 9, 12},
				{3, 7, 10},
				{3, 4, 6, 7},
				{1, 2, 5, 12, 15},
				{3, 4, 8, 15},
				{5, 6, 8, 11},
				{0, 6, 9, 11},
				{0, 3, 10, 11},
				{9, 10, 11, 12}
		};
		int k=7;
		
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