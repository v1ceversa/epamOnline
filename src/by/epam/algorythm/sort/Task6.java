package by.epam.algorythm.sort;

import java.util.Random;
import java.util.Scanner;

public class Task6
{
	
	public static void ShellSort(double[] arr)
	{
		int n = arr.length;
		double tmp;
		for (int step = n / 2; step > 0; step /= 2)
		{
			for (int i = step; i < n; i++)
			{
				for (int j = i - step; j >= 0 && arr[j] > arr[j + step]; j -= step)
				{
					tmp = arr[j];
					arr[j] = arr[j + step];
					arr[j + step] = tmp;
				}
			}
		}
	}
	
	public static void taskSort(double[] arr)
	{
		int n = arr.length;
		for(int i = 1; i < n; i++)
		{
			double tmp = arr[i];
			int j;
			for(j = i - 1; j >= 0 && arr[j] >= tmp;  j--)
			{
				arr[j + 1] = arr[j];
			}
			arr[j+1] = tmp;
		}
	}
	
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();
		int n = in.nextInt();
		double[] arr = new double[n];
		for(int i = 0; i < n; i++)
		{
			arr[i] = rnd.nextDouble()*1000;
		}
		for(int i = 0; i < n; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		taskSort(arr);
		for(int i = 0; i < n; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
