package by.epam.algorythm.arr_of_arr;

import java.util.Random;
import java.util.Scanner;

public class Task3
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();
		int n = in.nextInt();
		int m = in.nextInt();
		int k = in.nextInt();
		int p = in.nextInt();
		double[][] matrix = new double[n][m];
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < m; j++)
			{
				matrix[i][j] = rnd.nextDouble();
			}
		}
		for(int j = 0; j < m; j++)
		{
			System.out.print(matrix[k-1][j] + " ");
		}
		System.out.println();
		for(int i = 0; i < n; i++)
		{
			System.out.print(matrix[i][p-1] + " ");
		}
		System.out.println();
	}

}
