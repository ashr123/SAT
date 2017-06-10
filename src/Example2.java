public class Example2
{
	public static void main(String[] args)
	{
		String[] courses={"Introduction to Computer Science", "Algebra 1", "Introduction to Logic and Set Theory",
				"English", "Calculus 1", "Calculus 2", "Algorithms", "Economics 1", "Differential Equations",
				"Algebra2", "Introduction to Philosophy"};
		
		int[] schedule={1, 0, 2, 1, 0, 0, 2, 3, 5, 1, 1};
		Task2.printSchedule(schedule, courses);
		//Exp.printSchedule(schedule, courses);
		
		//String[] courses2={};
		//Task2.printSchedule(schedule, courses2);
		
		//schedule=null;
		//Task2.printSchedule(schedule, courses);
	}
}