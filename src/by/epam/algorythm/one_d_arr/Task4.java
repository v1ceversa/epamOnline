package by.epam.algorythm.one_d_arr;

import java.util.Random;
import java.util.Scanner;

public class Task4
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double[] arr = new double[n];
		Random rnd = new Random();
		for(int i = 0; i < n; i++)
		{
			arr[i] = rnd.nextDouble();
		}
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		int maxId = 0;
		int minId = 0;
		for(int i = 0; i < n; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
				maxId = i;
			}
			else if(arr[i] < min)
			{
				min = arr[i];
				minId = i;
			}
		}
		double temp = arr[maxId];
		arr[maxId] = arr[minId];
		arr[maxId] = temp;
	}

}
