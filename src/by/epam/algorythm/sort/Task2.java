package by.epam.algorythm.sort;

import java.util.Random;
import java.util.Scanner;

public class Task2
{
	public static void sort(int[] arr)
	{
		int step, i, j, tmp;
		int n = arr.length;
		for (step = n / 2; step > 0; step /= 2)
		{
			for (i = step; i < n; i++) 
			{
				for (j = i - step; j >= 0 && arr[j] > arr[j + step]; j -= step)
				{
					tmp = arr[j];
					arr[j] = arr[j + step];
					arr[j + step] = tmp;
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();
		int n = in.nextInt();
		int m = in.nextInt();
		int l = n + m;
		int[] first = new int[n];
		int[] second = new int[m];
		int[] result = new int[l];
		for(int i = 0; i < n; i++)
		{
			first[i] = rnd.nextInt();
		}
		for(int i = 0; i < m; i++)
		{
			second[i] = rnd.nextInt();
		}
		sort(first);
		sort(second);
		int k = 0;
		int j = 0;
		for(int i = 0; i < l; i++)
		{
			result[i] = (k == m) || (j < n && first[j] < second[k]) 
					? first[j++] 
					: second[k++];
		}
		
	}

}
