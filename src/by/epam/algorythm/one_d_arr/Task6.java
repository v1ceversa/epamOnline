package by.epam.algorythm.one_d_arr;

import java.util.Random;
import java.util.Scanner;

public class Task6
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();
		int n = in.nextInt();
		double[] arr = new double[n];
		for(int i = 0; i < n; i++) 
		{
			arr[i] = rnd.nextDouble();
		}
		boolean[] arr_index = new boolean[n];
		for(int i = 2; i*i <= n; i++)
		{
			if(!arr_index[i-1])
			{
				System.out.println(arr[i-1]);
				for(int j = i*i; j - 1 < n; j += i)
				{
					arr_index[j - 1] = true;
				}
			}
		}
	}
}
