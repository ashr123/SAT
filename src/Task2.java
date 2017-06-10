public class Task2
{
	public static void printSchedule(int[] schedule, String[] courses)//Prints the tests that are planned for each day.
	{
		if (schedule==null || courses==null || schedule.length==0 || courses.length==0 || schedule.length!=courses.length)
			throw new IllegalArgumentException("Illegal  Arguments");
		int maxDay=0;
		for (int aSchedule : schedule)//Finds the max' day that has a test planned.
			maxDay=Math.max(maxDay, aSchedule);
		
		for (int i=0; i<=maxDay; i++)
		{
			System.out.print("Day "+i+": ");
			boolean firstCourse=false;
			for (int j=0; j<schedule.length; j++)
				if (schedule[j]==i)
				{
					if (firstCourse) System.out.print(", ");
					else firstCourse=true;
					System.out.print(courses[j]);
				}
			if (i<maxDay) System.out.println();
		}
	}
}