package by.epam.algorythm.sort;

import java.util.Scanner;

public class Task4
{

	public static int bubbleSort(int[] arr)
	{
		int exchanges = 0;
		int n = arr.length;
		boolean sorted = true;
		while(sorted)
		{
			int i = 0;
			sorted = true;
			for(int j = 1; j < n; j++)
			{
				if(arr[i] > arr[j])
				{
					exchanges++;
					sorted = false;
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					i = j;
				}
			}
		}
		return exchanges;
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
		bubbleSort(arr);

	}

}
