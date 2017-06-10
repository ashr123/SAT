import java.util.Scanner;
import java.util.Arrays;

public class Exp
{
	public static void main(String[] args)
	{
		int[] a=new int[5];
		Integer i=new Integer(5);
	}
	
	public static int linearSearch(int[] array, int key)
	{
		if (array==null)
			throw new RuntimeException();
		int output=-1;// default (not found) value
		for (int i=0; i<array.length; i=i+1)
		{
			if (key==array[i])
				output=i;
		}
		return output;
	}
	
	//assumes that: a!=null
	public static int binarySearch(int[] a, int key)
	{
		if (a==null)
			throw new RuntimeException();
		
		int output=-1;// default (not found) value
		boolean found=false;
		int low=0, high=a.length-1;
		while (low<=high & !found)
		{
			int middle=(low+high)/2;
			if (a[middle]==key)
			{
				output=middle;
				found=true;
			} else if (key<a[middle])
				high=middle-1;
			else
				low=middle+1;
		}
		return output;
	}
	
	public static void insertionSort(int[] a)
	{
		if (a==null)
			throw new RuntimeException();
		for (int i=1; i<a.length; i=i+1)
		{
			insert(a, i);
		}
	}
	
	// assumes that a!=null, 0<=i<a.length
	private static void insert(int[] a, int i)
	{
		// insert the element at index i into its
		// correct position to the left
		int value=a[i];
		// shift the larger elements to the right
		while (i>0 && a[i-1]>value)
		{
			a[i]=a[i-1];
			i=i-1;
		}
		a[i]=value;
	} // insert
	
	public static void selectionSort(int[] array)
	{
		if (array==null) throw new RuntimeException();
		for (int i=0; i<array.length-1; i=i+1)
		{
			int minInd=minIndex(array, i);
			swap(array, i, minInd);
		}
	} // selectionSort
	
	// Assumes a!=null & from<a.length
	public static int minIndex(int[] a, int from)
	{
		int minIndex=from;
		for (int i=from+1; i<a.length; i=i+1)
			if (a[i]<a[minIndex])
				minIndex=i;
		return minIndex;
	} // minIndex
	
	//swap element a[i] with a[j]
	public static void swap(int[] a, int i, int j)
	{
		int tmp=a[i];
		a[i]=a[j];
		a[j]=tmp;
	} // swap
	
	public static void printArray(int[] a)
	{
		for (int element : a)
			System.out.print(element+" ");
		System.out.println();
	}
}