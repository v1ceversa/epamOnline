package by.epam.algorythm.arr_of_arr;

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
		double[][] matrix = new double[n][n];
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				matrix[i][j] = rnd.nextDouble();
			}
		}
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		int k = in.nextInt();
		int l = in.nextInt();
		for(int i = 0; i < n; i++)
		{
			double temp = matrix[i][k];
			matrix [i][k]= matrix[i][l];
			matrix [i][l]= temp;
		}
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}
