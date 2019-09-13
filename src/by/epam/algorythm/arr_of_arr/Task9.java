package by.epam.algorythm.arr_of_arr;

import java.util.Random;
import java.util.Scanner;

public class Task9
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();
		int n = in.nextInt();
		int m = in.nextInt();
		double[][] matrix = new double[n][m];
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < m; j++)
			{
				matrix[i][j] = Math.abs(rnd.nextDouble());
			}
		}
		int maxId = 0;
		double maxSum = Double.MIN_VALUE;
		for(int j = 0; j < m; j++)
		{
			double sum = 0;
			for(int i = 0; i < n; i++)
			{
				sum += matrix[i][j];
			}
			if(sum > maxSum)
			{
				maxSum = sum;
				maxId = j;
			}
		}
		System.out.println("id: " + maxId + ", sum: " + maxSum);
	}

}
