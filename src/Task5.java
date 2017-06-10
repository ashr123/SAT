public class Task5
{
	public static int[][] atLeastOne(int[] vars)//Returns a CNF formula that provide its Compatible with all the ways in which they can give true value to at least one of the variables in the input in vars.
	{
		int numOfClause=1;
		int numOfLiteralsInClause=vars.length;
		int[][] formula=new int[numOfClause][numOfLiteralsInClause];
		
		formula[0]=vars;
		
		return formula;
	}
	
	public static int[][] atMostOne(int[] vars)//Function receives an array of CNF's variables and returns a group of placements that compatible with all the ways in which you can give at mose one true value to the variables in the input dataset of CNF
	{
		int n=vars.length, lastClause=0;
		int numOfVarsPairs=n*(n-1)/2;
		int numOfLiteralsInClause=2;
		int[][] formula=new int[numOfVarsPairs][numOfLiteralsInClause];
		
		for (int i=0; i<n-1; i++)
			for (int j=i+1; j<n; j++)
			{
				formula[lastClause][0]=-vars[i];
				formula[lastClause++][1]=-vars[j];
			}
		
		return formula;
	}
	
	public static int[][] exactlyOne(int[] vars)//Function receives an array of CNF's variables and returns a group of placements that compatible with all the ways in which you can give exactly one true value to the variables in the input dataset of CNF
	{
		int n=vars.length;
		int numOfVarsPairs=n*(n-1)/2;
		int numOfClauses=numOfVarsPairs+1;
		int[][] formula=new int[numOfClauses][];
		
		formula[0]=vars;
		int[][] fivePointTwo=atMostOne(vars);
		for (int i=1; i<formula.length; i++)
			formula[i]=fivePointTwo[i-1];
		
		return formula;
	}
	
	public static int[][] notSameDay(int[] vars1, int[] vars2)
	{
		int numOfClause=vars1.length;
		int numOfLiteralsInClause=2;
		int[][] formula=new int[numOfClause][numOfLiteralsInClause];
		
		for (int i=0; i<numOfClause; i++)
		{
			formula[i][0]=-vars1[i];
			formula[i][1]=-vars2[i];
		}
		
		return formula;
	}
}