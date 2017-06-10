import java.util.Arrays;

public class Example5
{
	
	public static void main(String[] args)
	{
		testAtLeastOne();
		System.out.println();
		
		testAtMostOne();
		System.out.println();
		
		testExactlyOne();
		System.out.println();
		
		testNotSameDay();
	}
	
	private static void testNotSameDay()
	{
		{
			int[] vars1={1, 2, 3, 4};
			int[] vars2={10, 20, 30, 40};
			
			int[][] formula=Task5.notSameDay(vars1, vars2);
			System.out.println(Arrays.deepToString(formula));
		}
		{
			int[] vars1={2, 5, 7};
			int[] vars2={3, 4, 8};
			
			int[][] formula=Task5.notSameDay(vars1, vars2);
			System.out.println(Arrays.deepToString(formula));
		}
	}
	
	private static void testExactlyOne()
	{
		{
			int[] vars={1, 2, 3, 4};
			int[][] formula=Task5.exactlyOne(vars);
			System.out.println(Arrays.deepToString(formula));
		}
		{
			int[] vars={7, 5};
			int[][] formula=Task5.exactlyOne(vars);
			System.out.println(Arrays.deepToString(formula));
		}
		
	}
	
	private static void testAtMostOne()
	{
		{
			int[] vars={1, 2, 3, 4};
			int[][] formula=Task5.atMostOne(vars);
			System.out.println(Arrays.deepToString(formula));
		}
		{
			int[] vars={7, 5};
			int[][] formula=Task5.atMostOne(vars);
			System.out.println(Arrays.deepToString(formula));
		}
	}
	
	public static void testAtLeastOne()
	{
		{
			int[] vars={1, 2, 3, 4, 5};
			int[][] formula=Task5.atLeastOne(vars);
			System.out.println(Arrays.deepToString(formula));
		}
		{
			int[] vars={20, 10};
			int[][] formula=Task5.atLeastOne(vars);
			System.out.println(Arrays.deepToString(formula));
		}
	}
}