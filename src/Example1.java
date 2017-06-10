public class Example1
{
	public static void main(String[] args)
	{
		String[] students={"Yael Studentson", "Moshe Classroom", "Alice", "Bob"};
		String[] courses={"Introduction to Computer Science", "Algebra 1", "Introduction to Logic and Set Theory",
				"English", "Calculus 1"};
		int[][] studentCourses={{0, 1, 2, 3}, {1, 4, 2}, {0, 1, 4, 2, 3}, {4, 2, 1}};
		
		Task1.printStudentData(students, courses, studentCourses, 3);
	}
}