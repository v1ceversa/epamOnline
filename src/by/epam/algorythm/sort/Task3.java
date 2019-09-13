package by.epam.algorythm.sort;

import java.util.Scanner;

public class Task3
{

	public static void selectionSort(int[] arr)
	{
		int n = arr.length;
		for(int i = 0; i < n - 1; i++)
		{
			int maxId = i;
			int max = Integer.MIN_VALUE;
			for(int j = i; j < n; j++)
			{
				if(max < arr[j])
				{
					max = arr[j];
					maxId = j;
				}
			}
			int tmp = arr[maxId];
			arr[maxId] = arr[i];
			arr[i] = tmp;
		}
	}
	
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
		{
			arr[i] = in.nextInt();
		}
		selectionSort(arr);
	}

}
