public class Example3
{
	public static void main(String[] args)
	{
		String[] students={"Yael Studentson", "Moshe Classroom", "Alice", "Bob"};
		String[] courses={"Introduction to Computer Science", "Algebra 1", "Introduction to Logic and Set Theory",
				"English", "Calculus 1"};
		int[] schedule={1, 0, 2, 1, 0};
		int[][] studentCourses={{0, 1, 2, 3}, {1, 4, 2}, {0, 1, 4, 2, 3}, {4, 2, 1}};
		System.out.println("Students data:");
		Task1.printStudentData(students, courses, studentCourses, 3);
		System.out.println();
		System.out.println("Schedule:");
		Task2.printSchedule(schedule, courses);
		System.out.println();
		System.out.println("Conflicting courses:");
		Task3.printConflictingStudent(schedule, students, courses, studentCourses, 3);
		
		// Another example
		int[] schedule2={1, 2, 2, 8, 0};
		int[][] studentCourses2={{0, 2, 3}, {1, 4, 3}, {0, 2, 3}, {4, 2, 0}};
		
		System.out.println();
		System.out.println("Students data:");
		Task1.printStudentData(students, courses, studentCourses2, 3);
		System.out.println();
		System.out.println("Schedule:");
		Task2.printSchedule(schedule2, courses);
		System.out.println();
		System.out.println("Conflicting courses:");
		Task3.printConflictingStudent(schedule2, students, courses, studentCourses2, 3);
		System.out.println(Task3.isLegalSchedule(schedule2, students, courses, studentCourses2, 3));
	}
}