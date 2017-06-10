public class Example0
{
	public static void printf(Object element)
	{
		System.out.print(element);
	}
	public static void main(String[] args)
	{
		System.out.println("nulls: "+Task0.legalData(null, null, null, 0));
		
		// Example of legal data
		String[] students={"Yael Studentson", "Moshe Classroom", "Alice", "Bob"};
		String[] courses={"Introduction to Computer Science", "Algebra 1", "Introduction to Logic and Set Theory", "English", "Calculus 1"};
		int[][] studentCourses={{0, 1, 2, 3}, {1, 4, 2}, {0, 1, 4, 2, 3}, {4, 2, 1}};
		//System.out.println(Task0.legalData(students, courses, studentCourses, 4));
		printf(Task0.legalData(students, courses, studentCourses, 4));
		
		// Example of illegal data: negative k
		System.out.println("negative k: "+Task0.legalData(students, courses, studentCourses, -13));
		
		// Example of illegal data: one student is not listed to a course
		int[][] studentCourses2={{0, 1, 2, 3}, {}, {0, 1, 4, 2, 3}, {4, 2, 1}};
		System.out.println("one student is not listed to a course: "+Task0.legalData(students, courses, studentCourses2, 4));
		
		// Example of illegal data: no student is listed to course 0
		int[][] studentCourses3={{1, 2, 3}, {1, 4, 2}, {1, 4, 2, 3}, {4, 2, 1}};
		System.out.println("no student is listed to course 0: "+Task0.legalData(students, courses, studentCourses3, 4));
	}
}