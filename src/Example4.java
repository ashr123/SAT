import java.util.Arrays;

public class Example4
{
	public static void main(String[] args)
	{
		int[][] studentCourses={{0, 1, 3, 4}, {1, 2, 3}, {5, 1}, {0, 1, 2, 3, 4}, {2, 3, 1}};
		boolean[][] table=Task4.findExamConflicts(6, studentCourses);
		System.out.println(Arrays.deepToString(table));
		
		int[][] studentCourses2={{0, 4}, {1, 5}, {5, 1}, {2, 3}, {0, 4}};
		boolean[][] table2=Task4.findExamConflicts(6, studentCourses2);
		System.out.println(Arrays.deepToString(table2));
	}
}