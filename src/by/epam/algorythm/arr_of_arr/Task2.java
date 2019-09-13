package by.epam.algorythm.arr_of_arr;

import java.util.Random;
import java.util.Scanner;

public class Task2
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
			System.out.print(matrix[i][i] + " ");
		}
		System.out.println();
	}

}
