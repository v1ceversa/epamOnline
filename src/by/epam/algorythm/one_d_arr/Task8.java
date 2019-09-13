package by.epam.algorythm.one_d_arr;

import java.util.Random;
import java.util.Scanner;

public class Task8
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
		{
			arr[i] = rnd.nextInt();
		}
		int min = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++)
		{
			min = Math.min(min, arr[i]);
		}

	}

}
