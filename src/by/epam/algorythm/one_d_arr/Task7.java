package by.epam.algorythm.one_d_arr;

import java.util.Random;
import java.util.Scanner;

public class Task7
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
		double max = Double.MIN_VALUE;
		for(int i = 0; i <= n/2; i++)
		{
			max = Math.max(max, arr[i] + arr[n-1-i]);
		}
		System.out.print(max);
	}

}
